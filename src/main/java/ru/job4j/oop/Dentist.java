package ru.job4j.oop;

public class Dentist extends Doctor{
    private String pacient;
    private String diagnosis;

    public String getPacient(String pacient){
        this.pacient = pacient;
    }
    public String getDiagnosis(String diagnosis){
        this.diagnosis = diagnosis;
    }

}
