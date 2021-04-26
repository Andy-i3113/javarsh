package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> arr = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                arr.put(name, id);

            } catch (NumberFormatException e) { break;
            }
        }

        for(Map.Entry m : arr.entrySet()){
            System.out.println(m.getValue()+" "+m.getKey());
        }


    }
}
