package com.ll.exam;

import com.ll.TestUt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ll.exam1.MyArrayList;

import java.util.stream.IntStream;

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
        assertThat(list.size()).isEqualTo(2);
    }
    @Test
    @DisplayName("get(1)")
    void t3() {
        MyArrayList<String> list=new MyArrayList<>();

        list.add("apple"); //data[0]
        list.add("grape"); //data[1]

        assertThat(list.get(0)).isEqualTo(" apple");//data[0]
        assertThat(list.get(1)).isEqualTo("grape");//data[1]
        // get은 이렇게 작동 되어야 한다. 전제하여 만들기
    }

    @Test
    @DisplayName("data(배열)의 크기가 자동으로 늘어나야 한다.")
    void t4() {
        MyArrayList<String> list = new MyArrayList<>();

        //초창기 배열의 길이
        int dataLength1= ((String[])TestUt.getFieldValue(list,"data",null)).length;

       //IntStream.range(0,10); = [0..9]까지의 int stream 발생
        // 딱 1번 넘칠만큼의 데이터를 넣는다.
        IntStream.rangeClosed(0,dataLength1)
                        .forEach(index->list.add("사과 %d.".formatted(index)));

        //현재 배열의 길이
        int dataLength2= ((String[])TestUt.getFieldValue(list,"data",null)).length;
        assertThat(dataLength2).isGreaterThan(dataLength1);
    }

}
