package com.java.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromDirectoryEx {

    public static void main(String[] args) throws IOException{
        Path path = Paths.get("C:\\Users\\Byun\\dev\\java_master");

        Stream<Path> stream = Files.list(path);//Files.list메소드를 들어가보면 throws IOException이 되어있음. 따라서 Throw하거나 try,catch
        stream.forEach(p-> System.out.println(p.getFileName()));
        FromDirectoryEx directoryEx = new FromDirectoryEx();
        directoryEx.input();
    }
    public void input(){
        String num = "    2       + 3   "; //연산자 좌우에는 공백이 필요. substring으로 해결해보기. 리스트에서 숫자 연산자 숫자 연산자 체크
        List<String> numList = new ArrayList<>(Arrays.asList(num.trim().split(" ")));
//        numList.stream()
//                .filter(s -> !s.isEmpty())
//                .forEach(System.out::println);
        numList.removeIf(""::equals); //2    + 3 과같이 긴 공백 제거
        numList.forEach(System.out::println);
        //int 체크는 parseInt에서 exception으로 잡기
        //연산자 체크는 map으로 구현되어있으니 containsKey로 false이면 notOperationException발생.
        //재귀함수로 구현해보기, 연산결과를 매개변수에 넣는식으로,

    }

}
