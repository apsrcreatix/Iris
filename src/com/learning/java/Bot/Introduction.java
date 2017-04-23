package com.learning.java.Bot;

import com.learning.java.File_Handling.Student;

import java.time.LocalTime;
import java.util.Scanner;

/**
 * Created by Aditya Rajput on 4/21/2017.
 */
public class Introduction {
    public void intro(){
        System.out.println("\t\t\t\t\tI am your Surprise Test.");
//        System.out.println("\t\t\t\t\tToday is your surprise test !");
        pauser2();
        System.out.println("\t\t\t\t\t \uD83D\uDE02 \uD83D\uDE02 \uD83D\uDE02 \uD83D\uDE02 \uD83D\uDE02");
        pauser1();
        System.out.println("\t\t\t\t\tIt sounds horrible ! \uD83D\uDE31");
        pauser0();
    }

    public void wishes(){
        LocalTime localTime = LocalTime.now();
        StringBuffer timer = new StringBuffer(String.valueOf(localTime));
        String taken = timer.substring(0,2);
        int time_taken = Integer.parseInt(taken);
        iris();
        if(time_taken>=0&&time_taken<=12)
            System.out.println("\t\t\t\t\tGood Morning ! ☺");
        else
        if(time_taken>=12&&time_taken<=16)
            System.out.println("\t\t\t\t\tGood After Noon ! ☺");
        else
            System.out.println("\t\t\t\t\tGood Evening ! ☺");
        pauser1();
    }



    public void pauser0(){
        try{
            Thread.sleep(700);//1000
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    public void pauser1(){
        try{
            Thread.sleep(1500);//2000
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }public void pauser2(){
        try{
            Thread.sleep(2500);//3000
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    public void counter(){
        try{
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print("⏱ !\n");
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }

    public static void signShow(){
        System.out.print(" ➥ ");
    }
    public static void iris(){
        System.out.println("\t\t\t\uD83D\uDC41\uD83D\uDC41 :");
    }
}

