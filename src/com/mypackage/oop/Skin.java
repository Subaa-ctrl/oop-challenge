package com.mypackage.oop;

public class Skin extends Organ{
    private int softness;
    private String color;
    public Skin(String name, String medCondition, String color, int softness){
        super(name, medCondition);
        this.color = color;
        this.softness = softness;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setSoftness(int softness){
        this.softness = softness;
    }
    public int getSoftness(){
        return softness;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("colour: " + this.getColor());
    }
}
