package ru.job4j.oop;

public class Builder extends Engineer{
    private String project;
    private String deadline;

    public String getProject(String project){
        this.project = project;
    }
    public String getDeadline(String deadline){
        this.deadline = deadline;
    }
}
