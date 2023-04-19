package com.ll.exam;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ll.MyArrayList;
import static org.assertj.core.api.Assertions.assertThat;



public class MyArrayListTest {

    @Test
    @DisplayName("testSize")
    void t1() {
        MyArrayList<String> list=new MyArrayList<>();
        assertThat(list.size()).isEqualTo(0);
    }
    @Test
    @DisplayName("testAdd")
    void t2() {
        MyArrayList<String> list=new MyArrayList<>();
        list.add("apple");
        list.add("grape");
        assertThat(list.size()).isEqualTo(0);
    }
}
