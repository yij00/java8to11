package me.study.java8to11.java8to11.AE_스트림;

import me.study.java8to11.java8to11.AF_Optional.Progress;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OnlineClass {
    private Integer id;

    private String title;

    private boolean closed;

    private Progress process;

    public OnlineClass(Integer id, String title, boolean closed) {
        this.id = id;
        this.title = title;
        this.closed = closed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public Optional<Progress> getProcess() {
        return Optional.ofNullable(process);
    }

    public void setProcess(Progress process) {
        this.process = process;
    }
}
