package ru.job4j.oop;

public class Engineer extends  Profession {
    private int experience;
    private String certification;

     public int getExperience(int experience){
         this.experience = experience;
     }

     public String getCertification(String certification){
         this.certification = certification;
     }
}
