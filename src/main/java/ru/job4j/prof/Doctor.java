package ru.job4j.prof;

public class Doctor extends Profession{
    private int experience;
    private String certification;

    public Doctor(){
    }

    public Doctor(String name, String surname, String education, String birthday, int experience, String certification){
        super(name, surname, education, birthday);
        this.experience = experience;
        this.certification = certification;
    }
    public getExperience(int experience){
        this.experience = experience;
    }

    public getCertification(String certification){
        this.certification = certification;
    }
}
