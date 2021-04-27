package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        String list = null;
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list += line;
        }

        char[] symbol = list.toLowerCase().toCharArray();

        int count = 0;
        for (Character item:alphabet) {
            count = 0;
            for (char el:symbol)
            {
                if (item.equals(el)) {
                    count++;
                }
            }
            System.out.println(item + " " + count);
        }
    }
}
