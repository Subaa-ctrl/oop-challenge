package com.mypackage.oop;

public class Heart extends Organ{
    private int rate;
    public Heart(String name, String medCondition, int rate){
        super(name, medCondition);
        this.rate = rate;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart rate: " + this.getRate());
    }

    public void setRate(int rate){
        this.rate = rate;
    }
    public int getRate(){
        return rate;
    }
}
