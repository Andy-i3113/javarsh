package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String title = reader.readLine();
        if (title.equals("helicopter") ) { result = new Helicopter(); }
        if (title.equals("plane")) {

            result = new Plane(5); }


    }
}
