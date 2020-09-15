package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesEx {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("변지수",Member.MALE,28),
                new Member("임도이",Member.FEMALE,28)
        );
        double ageAvg = list.stream()
                .filter(member -> member.getSex() == Member.MALE)
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();

        System.out.println("ageAvg = " + ageAvg);
    }
}
