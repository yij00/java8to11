package me.study.java8to11.java8to11.AA_람다표현식;

import java.util.function.*;

public class Foo {

    public static void main(String[] args) {
//       Plus10 plus10 = new Plus10();
//        System.out.println(plus10.apply(10));

        UnaryOperator<Integer> plus10_2 = (i) -> i + 10;
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;
        System.out.println(plus10.apply(10));
        System.out.println(multiply2.apply(10));

        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println(multiply2AndPlus10.apply(2));

        System.out.println(plus10.andThen(multiply2).apply(2));

        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);

        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        Predicate<String> startsWithYij00 = (s) -> s.startsWith("yij00");
        System.out.println(startsWithYij00.test("yij00"));

        Foo foo = new Foo();
        foo.run();

    }

    private void run() {
        int baseNumber = 10;

        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber); // 11
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer baseNumber) {
                System.out.println(baseNumber);
            }
        };

        // 람다
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };

        printInt.accept(10);
    }
}

