package com.java.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxEx {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        /* IntStream -> DoubleStream */
        IntStream intStream = Arrays.stream(intArray);
        intStream.asDoubleStream()
                .forEach(System.out::println);

        System.out.println();
        /* int -> Integer stream */
        intStream = Arrays.stream(intArray);
        intStream
                .boxed()
                .forEach(obj -> System.out.println(obj.intValue()));
    }

}
