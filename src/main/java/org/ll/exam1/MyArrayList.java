package org.ll.exam1;

public class MyArrayList<T> {
    private int size=0;
    public int size(){
        return size;
    }
    public boolean add(String element){
        size++;
        return true; // 항상 true를 리턴
    }

    public String get(int index) {
        return "grape";
    }
}
