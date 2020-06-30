package me.study.java8to11.java8to11.AC_인터페이스;

public class DefaultFoo implements Foo {
    String name;

    public DefaultFoo(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void printNameUpperCase() {
        System.out.println(this.name.toUpperCase());
    }

    public static void main(String[] args) {
        Foo foo = new DefaultFoo("yij00");
        foo.printName();
        foo.printNameUpperCase();
        Foo.printAnything();

    }
}
