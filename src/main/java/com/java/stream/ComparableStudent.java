package com.java.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Getter
@AllArgsConstructor
public class ComparableStudent implements Comparable<ComparableStudent>{

    private String name;
    private int score;

    @Override
    public int compareTo(ComparableStudent o) {
        return Integer.compare(score,o.score);
    }

    public static void main(String[] args) {
        List<ComparableStudent> studentList = Arrays.asList(
                new ComparableStudent("변지수",100),
                new ComparableStudent("동르",110),
                new ComparableStudent("변리우",90)
        );
        studentList.stream()
                .sorted()
                .forEach(s-> System.out.println(s.getName()));

        studentList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s-> System.out.println(s.getName()));
    }
}
