package com.java.junit.chap02;

public class PercentileQuestion extends Question{
    public PercentileQuestion(int id, String text, String[] answerChoices){
        super(text,answerChoices,id);
    }

    @Override
    public boolean match(int expected, int actual){
        return expected <= actual;
    }
}
