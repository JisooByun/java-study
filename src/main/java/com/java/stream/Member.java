package com.java.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter@AllArgsConstructor
@NoArgsConstructor
public class Member {
    public static final int MALE = 0;
    public static final int FEMALE = 1;

    private String name;
    private int sex;
    private int age;

    @Override
    public int hashCode(){
        final int code= 31;
        return code;
    }
}
