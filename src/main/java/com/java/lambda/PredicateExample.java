package com.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateExample {
    private static List<Student> list = Arrays.asList(
            new Student("홍길동","여자",12),
            new Student("변지수","남자",28)
    );
    public static double avg(Predicate<Student> predicate){
        int count = 0,sum = 0;
        for (Student student : list) {
            if(predicate.test(student)){
                count++;
                sum+=student.getAge();
            }
        }
        return (double) sum/count;
    }
    /**
     * avg에 매개변수는 같지만 람다표현식에 의해 달라진다.
     * 람다 표현식의 타겟 인터페이스는 Predicate로 정해져있고
     * 람다식의 메소드 정의에 따라 test메소드가 달라진다.
     */
    public static void main(String[] args) {
        double maleAvg = avg(t -> t.getSex().equals("남자"));//test메소드 정의
        System.out.println("maleAvg = " + maleAvg);

        double womanAvg = avg(t -> t.getSex().equals("여자"));//test메소드 정의
        System.out.println("womanAvg = " + womanAvg);
    }
}
