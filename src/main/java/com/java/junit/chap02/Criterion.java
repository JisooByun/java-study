package com.java.junit.chap02;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Criterion implements Scoreable {
    private Weight weight;
    private Answer answer;
    private int score;

    public Criterion(Answer answer, Weight weight){
        this.answer = answer;
        this.weight = weight;
    }

}
