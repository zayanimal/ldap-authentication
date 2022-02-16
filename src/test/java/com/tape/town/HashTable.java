package com.tape.town;

import java.util.Arrays;

public class HashTable implements Cloneable {
    private Entry[] buckets;

    public void setBuckets(Entry[] entries) {
        buckets = entries;
    }

    public Entry[] getBuckets() {
        return buckets;
    }

    @Override
    public HashTable clone() throws CloneNotSupportedException {
        HashTable result = (HashTable) super.clone();
        result.buckets = new Entry[buckets.length];

        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] != null) {
                result.buckets[i] = buckets[i];
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "HashTable{" +
            "buckets=" + Arrays.toString(buckets) +
            '}';
    }
}
