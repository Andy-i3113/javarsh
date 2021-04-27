package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {

    static {

        readKeyFromConsoleAndInitPlanet();
    }

    public static void main(String[] args) {





    }

    public static Planet thePlanet;



    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {

        Scanner in = new Scanner(System.in);
        String ch = in.next();

        thePlanet = null;

        if (ch.equals(thePlanet.MOON)) thePlanet =  Moon.getInstance();
        if (ch.equals(thePlanet.EARTH)) thePlanet =  Earth.getInstance();
        if (ch.equals(thePlanet.SUN)) thePlanet =  Sun.getInstance();




    }
}
