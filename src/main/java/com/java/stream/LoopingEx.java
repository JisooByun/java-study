package com.java.stream;

import java.util.Arrays;

public class LoopingEx {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};

        System.out.println("peek마지막호출시");
        Arrays.stream(intArr)
                .filter(a->a%2==0)
                .peek(System.out::println);

        System.out.println("최종처리 메소드를 마지막에 호출시");
        Arrays.stream(intArr)
                .filter(a->a%2==0)
                .peek(System.out::println)
                .sum();

    }
}
