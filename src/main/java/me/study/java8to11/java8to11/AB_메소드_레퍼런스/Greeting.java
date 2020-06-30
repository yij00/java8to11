package me.study.java8to11.java8to11.AB_메소드_레퍼런스;

public class Greeting {
    private String name;

    public Greeting() {
    }

    public Greeting(String name) {
        this.name = name;
    }

    public String hello(String name) {
        return "hello " + name;
    }

    public static String hi(String name) {
        return "hi " + name;
    }

    public String getName() {
        return name;
    }
}
