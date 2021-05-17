package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Stallone1", dateFormat.parse("JUNE 1 1981"));
        map.put("Stallone2", dateFormat.parse("OCTOBER 1 1982"));
        map.put("Stallone3", dateFormat.parse("NOVEMBER 1 1983"));
        map.put("Stallone4", dateFormat.parse("JUNE 1 1984"));
        map.put("Stallone5", dateFormat.parse("JUNE 1 1985"));
        map.put("Stallone6", dateFormat.parse("JUNE 1 1986"));
        map.put("Stallone7", dateFormat.parse("JUNE 1 1987"));
        map.put("Stallone8", dateFormat.parse("JUNE 1 1988"));
        map.put("Stallone9", dateFormat.parse("JUNE 1 1989"));

        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date >> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> tmp = iterator.next();
            int month = tmp.getValue().getMonth();
            if ((month >=5) && (month <= 7)){
                iterator.remove();
            }
        }
    }



    public static void main(String[] args) {

    }
}
