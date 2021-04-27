package ru.job4j.oop;

public class Programmer extends Engineer{
    private String project;
    private String deadline;

    public newProgrammer(String name, String surname, String education, String birthday, String certification, int experience, String project,String deadline){
        super(name, surname, education, birthday, certification, experience);
        this.project = project;
        this.deadline = deadline;
    }
    public getProject(String project){
        this.project = project;
    }
    public getDeadline(String deadline){
        this.deadline = deadline;
    }
}
