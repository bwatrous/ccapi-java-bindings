package com.microsoft.cyclecloud;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PageResponseParser<T> {

    private final Class<?> bodyClass;
    private final Method collectionGetter;
    private final Method nextLinkGetter;

    public PageResponseParser(Class<?> bodyClass, Class<?> innerClass, String collectionGetter, String nextLinkGetter) {
        this.bodyClass = bodyClass;
        try {
            this.collectionGetter = bodyClass.getMethod(collectionGetter);
            if (nextLinkGetter != null) {
                this.nextLinkGetter = bodyClass.getMethod(nextLinkGetter);
            } else {
                this.nextLinkGetter = null;
            }
        } catch (NoSuchMethodException exc) {
            throw new RuntimeException(exc);
        }
    }

    public Page<T> parse(String body) {
        if (body == null) {
            return null;
        }
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            Object value = objectMapper.readValue(body, bodyClass);

            @SuppressWarnings("unchecked")
            List<T> valueList = (List<T>) collectionGetter.invoke(value);
            String nextLink = null;
            if (nextLinkGetter != null) {
                nextLink = (String) nextLinkGetter.invoke(value);
            }
            return new Page<T>(valueList, nextLink);
        } catch (IllegalAccessException | InvocationTargetException | IOException exc) {
            throw new RuntimeException(exc);
        }
    }

    public static class Page<T> extends ArrayList<T> {
        private static final long serialVersionUID = 3323766759425814226L;
        private final String nextLink;

        public Page(List<T> valueList, String nextLink) {
            super(valueList);
            this.nextLink = nextLink;
        }

        public String getNextLink() {
            return nextLink;
        }
    }
}
