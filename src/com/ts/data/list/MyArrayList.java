package com.ts.data.list;

public class MyArrayList<T> implements MyList<T> {
    private final static int DEFAULT_NUM = 10;
    private int size;//列表长度
    private Object[] data;
    private int index;//存放数据的

    MyArrayList(int num){
        this.size = num;
        this.data = new Object[num];
        this.index = 0;
    }
    MyArrayList(){
        this.size = DEFAULT_NUM;
        this.data = new Object[DEFAULT_NUM];
        this.index =0;
    }
    @Override
    public void add(T t) {
        data[index++] = t;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void remove(T t) {

    }

    @Override
    public T get(int index) {
        return (T) data[index];
    }

    @Override
    public boolean isEmpty() {
        return index==0;
    }

    public static void main(String[] args) {
        int num = 0;
        System.out.println(num++);
    }
}
