package com.java.generic;

public class Box<T> {
    private T t;
    public T getT(){ return t;}
    public void setT(T t){this.t = t;}

    public static <S> S boxing(S t){
        Box<S> box = new Box<>();
        box.setT(t);
        return box.getT();
    }

}
