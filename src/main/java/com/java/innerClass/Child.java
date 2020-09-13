package com.java.innerClass;

public class Child extends Parent {

    public Child(){
        this.method();
    }

    public void method(){

    }

    class Cchild{
//        Child.this.method();//
        void print(){
            Child.this.method();
        }
    }

}
