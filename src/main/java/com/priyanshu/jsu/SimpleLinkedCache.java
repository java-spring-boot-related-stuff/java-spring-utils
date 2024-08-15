package com.priyanshu.jsu;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleLinkedCache<K, V> extends LinkedHashMap<K, V> {
    private int capacity;

    public SimpleLinkedCache(int capacity) {
        super(capacity, 0.75f, true); // Pass 'true' for accessOrder.
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity; // This will remove the oldest entry when the size of map exceeds the capacity.
    }
}