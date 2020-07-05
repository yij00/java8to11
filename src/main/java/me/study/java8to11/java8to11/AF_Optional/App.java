package me.study.java8to11.java8to11.AF_Optional;

import me.study.java8to11.java8to11.AE_스트림.OnlineClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<OnlineClass> onlineClasses = new ArrayList<>();
        onlineClasses.add(new OnlineClass(1, "spring boot", true));
        onlineClasses.add(new OnlineClass(2, "spring data jpa", true));
        onlineClasses.add(new OnlineClass(3, "spring mvc", false));
        onlineClasses.add(new OnlineClass(4, "spring core", false));
        onlineClasses.add(new OnlineClass(5, "rest api development", false));

        OnlineClass spring_boot = new OnlineClass(1, "spring boot", false);
//        Progress progress = spring_boot.getProcess();
//        if(progress != null) {
//            System.out.println(progress.getStudyDuration());
//        }
    }
}
