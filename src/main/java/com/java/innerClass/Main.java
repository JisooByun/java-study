package com.java.innerClass;


public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent(){
            @Override
            public void parentMethod() {

            }
        };
    }
    public void method(Parent parent){

    }
    public void method2(){
        method(new Parent(){
            @Override
            public void parentMethod() {
                super.parentMethod();
            }
        });
    }
}
