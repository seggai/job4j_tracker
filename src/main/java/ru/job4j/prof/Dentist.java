package ru.job4j.prof;

public class Dentist extends Doctor{
    private String pacient;
    private String diagnosis;

    public newDentist(String name, String surname, String education, String birthday, int experience, String certification, String pacient, String diagnosis){
        super(name, surname, education, birthday, experience, certification);
        this.diagnosis = diagnosis;
        this.pacient = pacient;
    }
    public getPacient(String pacient){
        this.pacient = pacient;
    }
    public getDiagnosis(String diagnosis){
        this.diagnosis = diagnosis;
    }

}
