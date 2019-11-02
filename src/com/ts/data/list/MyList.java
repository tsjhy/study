package com.ts.data.list;

public interface MyList<T> {
    void add(T t);
    void remove(int index);
    void remove(T t);
    T get(int index);
    boolean isEmpty();
}
