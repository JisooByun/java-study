package com.java.stream;

import java.util.Arrays;

public abstract class MatchEx {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
//        String[] strArr = {"qus","wl","tn"};
        boolean result = Arrays.stream(intArr).allMatch(a->a%2==0);
        System.out.println(result);

        result = Arrays.stream(intArr).anyMatch(a->a%2==0);
        System.out.println(result);

        result = Arrays.stream(intArr).noneMatch(a->a%3==0);
        System.out.println(result);

        Member m1 = new Member();
        Member m2 = new Member();
        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);
        System.out.println(m1.equals(m2));
        System.out.println(m1 == m2);
    }
    abstract public void method();
}
