package com.java.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceEx {
    public static void main(String[] args) {
        Function<String , Member> function1 = Member::new;
        BiFunction<String,String, Member> function2 = Member::new;
        Member member1 = function1.apply("변지수1");
        Member member2 =function2.apply("변지수","19살");
        System.out.println("member1.getName() = " + member1.getName());
        System.out.println("member1.getName() = " + member2.getName());
        System.out.println("member1.getName() = " + member2.getId());
    }
}
