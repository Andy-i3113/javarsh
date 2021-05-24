package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {

        System.out.println(isDateOdd("MAY 1 2013"));

    }

    public static boolean isDateOdd(String date) throws ParseException {

            SimpleDateFormat format1 = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
            Date dateOne = format1.parse(date);
            Date dateTwo = format1.parse("January 1 " + String.valueOf(1900 + dateOne.getYear()));
             // Количество дней между датами в миллисекундах
            long difference = dateOne.getTime() - dateTwo.getTime();
            // Перевод количества дней между датами из миллисекунд в дни
            int days =  (int)(difference / (24 * 60 * 60 * 1000)); // миллисекунды / (24ч * 60мин * 60сек * 1000мс)
            return (days%2 == 0);

    }
}
