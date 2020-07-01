package me.study.java8to11.java8to11.AD_스테틱메소드;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<String> name = new ArrayList();
        name.add("yij00");
        name.add("yij01");
        name.add("yij02");
        name.add("yij03");
        name.add("kij03");

//        name.forEach(System.out::println);

        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();

        while(spliterator.tryAdvance(System.out::println));
        System.out.println("======");
        while(spliterator1.tryAdvance(System.out::println));
        System.out.println("======");

        name.removeIf( s -> s.startsWith("k"));
        name.forEach(System.out::println);

        System.out.println("======");
        Comparator<String> comparator = String::compareToIgnoreCase;
        name.sort(comparator.reversed());
        name.forEach(System.out::println);


    }
}
