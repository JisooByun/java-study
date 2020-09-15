package com.java.lambda;

import java.util.function.Function;
import java.util.function.ToIntBiFunction;

public class FunctionAndThenComposeEx {
    public static void main(String[] args) {
        Function<Member, Address> functionA;
        Function<Address,String> functionB;
        Function<Member,String> functionAB;
        String city;

        functionA  = Member::getAddress; //Function 인터페이스의 apply메소드 정의를 람다표현식으로 정의
        functionB = Address::getCity;
        Member member = new Member();

        Address address = functionA.apply(
                new Member("변지수","변",new Address("서울","서초구"))
        );
        System.out.println("address = " + address);

        functionAB = functionA.andThen(functionB);
        city = functionAB.apply(
                new Member("홍길도이","hong",new Address("한국","서울"))
        );//위 멤버 객체를 넘기면 서울이라는 String이 return됨.
        System.out.println("city = " + city);
    }
}
