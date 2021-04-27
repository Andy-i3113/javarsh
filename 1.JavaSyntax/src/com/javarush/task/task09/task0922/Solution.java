package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date d;
        d = new SimpleDateFormat("yyyy-MM-dd").parse(reader.readLine());
        SimpleDateFormat s1 = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println(s1.format(d).toUpperCase(Locale.ROOT));
    }
}
