package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class FilteringEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("변지수","변지연","변지수","임도이","임윤재","임도이");

        names.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();
        names.stream()
                .filter(n->n.startsWith("변"))
                .forEach(System.out::println);
        System.out.println();
        names.stream()
                .distinct()
                .filter(n->n.startsWith("임"))
                .forEach(System.out::println);
    }

}
