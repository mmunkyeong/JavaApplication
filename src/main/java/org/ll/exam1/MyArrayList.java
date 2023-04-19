package org.ll.exam1;

public class MyArrayList<T> {
    private String[] data=new String[10];
    private int size=0;
    public int size(){
        return size;
    }
    public boolean add(String element){
        data[size]=element;
        size++;
        return true; // 항상 true를 리턴
    }

    public String get(int index) {
        return data[index];
    }
}
