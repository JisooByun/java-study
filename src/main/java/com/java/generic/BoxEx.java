package com.java.generic;

//import com.java.effectiveJava.item02.NyPizza;

public class BoxEx<T extends BoxEx<T>> {
    private T t;
    public T getT(){ return t;}
    public void setT(T t){this.t = t;}

//    public static <S> S boxing(S t){
//        Box<S> box = new Box<>();
//        box.setT(t);
//        return box.getT();
//    }
    abstract static class BoxEx2<T extends BoxEx2<T>> {

    }
}
