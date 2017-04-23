package com.learning.java.Bot;

import java.util.Scanner;

/**
 * Created by Aditya Rajput on 4/23/2017.
 */
public interface Element {
    default void nonUsed(){}
    static void voiceEcho(){
        System.out.println("!");
    }

}

