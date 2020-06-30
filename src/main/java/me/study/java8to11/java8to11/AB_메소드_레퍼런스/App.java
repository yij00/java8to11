package me.study.java8to11.java8to11.AB_메소드_레퍼런스;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        Function<Integer, String> intToString = (i) -> "number";

        UnaryOperator<String> hi = Greeting::hi;
        System.out.println(hi.apply("yij00"));

        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        System.out.println(hello.apply("yij01"));

        Supplier<Greeting> newGreeting = Greeting::new;
        Greeting greeting1 = newGreeting.get();

        Function<String, Greeting> stringGreetingFunction = Greeting::new;
        Greeting greeting2 = stringGreetingFunction.apply("yij02");
        System.out.println(greeting2.getName());

        String[] names = {"yij01", "yij03", "yij00"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

    }
}
