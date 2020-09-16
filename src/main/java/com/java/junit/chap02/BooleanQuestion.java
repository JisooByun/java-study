package com.java.junit.chap02;

public class BooleanQuestion extends Question {
    public BooleanQuestion(int id, String text){
        super(text,new String[]{"NO","YES"},id);
    }

    @Override
    public boolean match(int expected, int actual) {
        return expected ==actual;
    }
}
