package com.java.generic;

public class Util {

    public static <K extends Number,V> Pair<K,V> compare(Pair<? extends Number,?> p1, Pair<K,V> p2){
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getKey());
        return p2;
    }
    public static <T extends Number> int compare(T t1,T t2){
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return Double.compare(v1,v2);
    }

}
