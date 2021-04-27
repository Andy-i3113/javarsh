package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        int[] myArray = new int[10];
        int i=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                myArray[i] = Integer.parseInt(reader.readLine());
                i++;
            }

        } catch (NumberFormatException | IOException e) {
            myArray = Arrays.copyOfRange(myArray, 0, i);
            for (int s:myArray)  System.out.println(s);

        }
    }
}
