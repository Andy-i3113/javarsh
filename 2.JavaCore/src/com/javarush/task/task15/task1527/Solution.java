package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.*;
import java.util.LinkedHashMap;

// http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

public class Solution {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = bufferedReader.readLine(); //читаем строку с клавиатуры

        String params = str.substring(str.indexOf("?") + 1);
        String[] splitParts;
        splitParts = params.split("&");



        LinkedHashMap<String, String> paramters = new LinkedHashMap<String, String>();
        for (int i = 0; i < splitParts.length; i++) {
            int posEqualChar = splitParts[i].indexOf("=");
            if (posEqualChar < 0) { //no param, only key exist
                paramters.put(splitParts[i], null);
                continue;
            }
            String key = splitParts[i].substring(0, posEqualChar);
            String value = splitParts[i].substring(posEqualChar + 1);
            paramters.put(key, value);
        }

        //key printing
        for (String key : paramters.keySet()) {
            System.out.print(key + " ");
        }

        System.out.println();
        String objParameter = paramters.get("obj");
        if (objParameter == null) {
            return;
        }

        try {
            alert(Double.parseDouble(objParameter));
        } catch (NumberFormatException e) {
            alert(objParameter);
        }
    }





    public static void alert(double value) {

        System.out.println("double: " + value);
    }

    public static void alert(String value) {

        System.out.println("String: " + value);
    }
}
