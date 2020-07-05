package me.study.java8to11.java8to11.AE_스트림;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("aij00");
        names.add("bij00");
        names.add("cij00");
        names.add("dij00");


        List<String> collect = names.stream()
                .map(s -> {
                    System.out.println(s + " : " + Thread.currentThread().getName());
                    return s.toUpperCase();
                }).collect(Collectors.toList());

        collect.forEach(System.out::println);

        List<String> collect2 = names.parallelStream()
                .map(s -> {
                    System.out.println(s + " : " + Thread.currentThread().getName());
                    return s.toUpperCase();
                }).collect(Collectors.toList());

        collect2.forEach(System.out::println);

        names.forEach(System.out::println);


    }
}
