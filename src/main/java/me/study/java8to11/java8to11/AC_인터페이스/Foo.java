package me.study.java8to11.java8to11.AC_인터페이스;

public interface Foo {

    void printName();

    /**
     * @implSpec
     * 이 구현체는 getNAme()으로 가져온 문자열을 대문자로 바꿔 출력한다
     */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }

    static void printAnything() {
        System.out.println("Foo");
    }

    String getName();
}
