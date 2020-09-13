package com.java.lambda;

import static java.lang.Integer.sum;

public class MainLambda {
    public static void main(String[] args) {
        MyFuntionalInterface fi;

        fi = (x,y)->x+y;
        int result = fi.method(5,10);
        System.out.println(result);
        System.out.println(sum(1,2));
    }
}
