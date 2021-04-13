package ru.job4j.oop;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public String getName(String name) {
        this.name = name;
    }

    public String getSurname(String surname) {
        this.surname = surname;
    }

    public String getEducation(String education){
        this.education = education;
    }

    public String getBirthday(String birthday){
        this.birthday = birthday;
    }
}
