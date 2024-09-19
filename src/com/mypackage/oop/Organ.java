package com.mypackage.oop;

public class Organ {
    private String name;
    private String medCondition;

            public Organ(String name, String medCondition){
        this.name = name;
        this.medCondition = medCondition;
            }
            public void getDetails(){
                System.out.println("Name: " + getName());
                System.out.println("Medical Condition: " + getMedCondition());
            }
            public void setName(String name){
            this.name = name;
            }
            public String getName(){
            return name;
            }
            public void setMedCondition(String medCondition){
                this.medCondition = medCondition;
            }
            public String getMedCondition(){
                return medCondition;
            }
}
