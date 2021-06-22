package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student Student = new Student();
        Student.setCreated(new Date());
        Student.setFullname("Yuri Argunov");
        Student.setGroup("E413");
        System.out.println(Student.getFullname() + " " + Student.getGroup() + " " + Student.getCreated());
    }
}
