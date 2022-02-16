package com.tape.town;

class Entry {
    public final Object key;
    public Object value;
    public Entry next;

    public Entry(Object key, Object value, Entry next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Entry deepCopy() {
        Entry result = new Entry(key, value, next);

        for (Entry p = result; p.next != null; p = p.next) {
            p.next = new Entry(p.next.key, p.next.value, p.next.next);
        }

        return result;
    }

    @Override
    public String toString() {
        return "Entry{" +
            "key=" + key +
            ", value=" + value +
            ", next=" + next +
            '}';
    }
}
