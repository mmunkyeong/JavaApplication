package com.ll.exam;

import org.junit.jupiter.api.Test;
import org.ll.MyArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyArrayListTest {
    @Test
    void testSize() {
        MyArrayList<String> list=new MyArrayList<>();
        assertEquals(0,list.size());
    }
}
