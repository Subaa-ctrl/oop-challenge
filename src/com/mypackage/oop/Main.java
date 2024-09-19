package com.mypackage.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("sara",30,
                new Eye("Left eye", "short sightedness", "brown",true),
                new Eye("right eye","normal","brown",true),
                new Heart("heart", "normal", 50),
                new Skin("skin","rosascea","brown",50),
                new Stomach("stomach","normal", true));
        System.out.println("name:" + patient.getName());
        System.out.println("age: " + patient.getAge());
        Scanner scanner = new Scanner(System.in);
        boolean shouldFinish = false;
        while (!shouldFinish) {
            System.out.println("choose an organ" +
                    "\n\t1. Left eye" +
                    "\n\t2. Right eye" +
                    "\n\t3. Heart" +
                    "\n\t4. Skin" +
                    "\n\t5. Stomach" +
                    "\n\t6. Quit");
            int choice =scanner.nextInt();
            switch (choice){
                case 1:
                    patient.getLeftEye().getDetails();
                    if(patient.getLeftEye().getIsOpened()){
                        System.out.println("\n\t1. Close the Eye");
                        if(scanner.nextInt() == 1){
                            patient.getLeftEye().close();
                        }else {
                            continue;
                        }
                    }else {
                        System.out.println("\n\t1. Open the eye");
                        if (scanner.nextInt() ==1){
                            patient.getLeftEye().close();
                        }else {
                            continue;
                        }
                    }
                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if(patient.getRightEye().getIsOpened()){
                        System.out.println("\n\t1. Close the Eye");
                        if(scanner.nextInt() == 1){
                            patient.getRightEye().close();
                        }else{
                            continue;
                        }
                    }else {

                            System.out.println("\n\t1. Open the Eye");
                            if(scanner.nextInt() == 1){
                                patient.getRightEye().open();
                            }else{
                                continue;
                            }
                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\n\t1.change heart rate");
                    if(scanner.nextInt() == 1){
                        System.out.println("enter heart rate: ");
                        int newRate = scanner.nextInt();
                        patient.getHeart().setRate(newRate);
                        System.out.println("heart rate changed to " + patient.getHeart().getRate());
                    }else {
                        continue;
                    }
                    break;
                case 5:
                    patient.getStomach().getDetails();
                    System.out.println("\n\t1.Digest");
                    if(scanner.nextInt() == 1){
                        patient.getStomach().digest();
                    }else {
                        continue;
                    }
                    break;
                case 4:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinish = true;
                    break;

            }
        }

    }
}
