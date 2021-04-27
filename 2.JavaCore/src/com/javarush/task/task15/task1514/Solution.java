package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {

    public static Map<Double, String> labels = new HashMap<Double, String>();

     static {


        labels.put(12d, "Васька1");
        labels.put(14d, "Васька2");
        labels.put(144d, "Васьк3а");
        labels.put(116d, "Васька4");
        labels.put(1154d, "Васька5");

    }



    public static void main(String[] args) {
        System.out.println(labels);

          }
}
