package com.mypackage.oop;

public class Stomach extends Organ{
    private boolean isEmpty;
    public Stomach(String name, String medCondition, boolean isEmpty){
        super(name, medCondition);
        this.isEmpty = isEmpty;
    }
    public void setIsEmpty(boolean isEmpty){
        this.isEmpty = isEmpty;
    }
    public boolean getIsEmpty(){
        return isEmpty;
    }
    public void digest(){
        System.out.println("Digesting...");
    }

    @Override
    public void getDetails() {
        super.getDetails();
        if(this.isEmpty){
            System.out.println("Need to be fed");
        } else {
            System.out.println("Stomach is full");
        }
    }
}
