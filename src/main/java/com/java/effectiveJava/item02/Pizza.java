package com.java.effectiveJava.item02;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    public enum Topping{HAM,MUSHROOM,ONION,PEPPER,SAUSAGE}
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);//빈 열거형 집합 생성
        public T addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));//Objects.requireNonNull<- 지정된 객체 참조가 null인지 확인
            return self();
        }
        abstract Pizza build();

        protected abstract T self();
    }
    Pizza(Builder<?> builder){
        toppings = builder.toppings.clone(); // set의 복사본 반환
    }
}
