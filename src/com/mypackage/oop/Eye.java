package com.mypackage.oop;

public class Eye extends Organ{
    private String color;
    boolean isOpened;
    public  Eye(String name, String medCondition, String color, boolean isOpened){
        super(name, medCondition);
        this.color = color;
        this.isOpened = isOpened;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("color: " + this.getColor());
    }

    public void open(){
        this.setIsOpened(true);
        System.out.println(this.getName() + "Opened");
    }
    public void close(){
        this.setIsOpened(false);
        System.out.println(this.getName() + "Closed");
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setIsOpened(boolean isOpened){
        this.isOpened = isOpened;
    }
    public boolean getIsOpened(){
        return isOpened;
    }


}
