package ru.job4j.oop;

public class Surgeon extends Doctor{
    private String pacient;
    private String diagnosis;

    public newSurgeon(String name, String surname, String education, String birthday, String certification, int expirience, String pacient, String diagnosis){
        super(name, surname, education,birthday,certification,expirience);
        this.pacient = pacient;
        this.diagnosis = diagnosis;
    }
    public getPacient(String pacient){
        this.pacient = pacient;
    }
    public getDiagnosis(String diagnosis){
        this.diagnosis = diagnosis;
    }
}
