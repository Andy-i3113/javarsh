package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> CreateMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", df.parse("JUNE 1 1981"));
        map.put("Stallone2", df.parse("OCTOBER 1 1982"));
        map.put("Stallone3", df.parse("NOVEMBER 1 1983"));
        map.put("Stallone4", df.parse("JUNE 1 1984"));
        map.put("Stallone5", df.parse("JUNE 1 1985"));
        map.put("Stallone6", df.parse("JUNE 1 1986"));
        map.put("Stallone7", df.parse("JUNE 1 1987"));
        map.put("Stallone8", df.parse("JUNE 1 1988"));
        map.put("Stallone9", df.parse("JUNE 1 1989"));
        map.put("Stallone0", df.parse("JUNE 1 1990"));

       return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date >> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> tmp = iterator.next();
            int month = tmp.getValue().getMonth();
            if ((month >=5) && (month <= 7)){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {

       // HashMap<String, Date> map = CreateMap();
        removeAllSummerPeople( CreateMap() );


    }


}


