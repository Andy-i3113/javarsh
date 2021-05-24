package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("MAY 2 2013"));

    }

    public static boolean isDateOdd(String date) {

        boolean flag;
        SimpleDateFormat format1 = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);

        try {
            Date dateOne = format1.parse(date);
            Date dateTwo = format1.parse("January 1 " + String.valueOf(1900 + dateOne.getYear()));
             // Количество дней между датами в миллисекундах
            long difference = dateOne.getTime() - dateTwo.getTime();
            // Перевод количества дней между датами из миллисекунд в дни
            int days =  (int)(difference / (24 * 60 * 60 * 1000)); // миллисекунды / (24ч * 60мин * 60сек * 1000мс)
            flag = (days%2 == 0);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return flag;
    }
}
