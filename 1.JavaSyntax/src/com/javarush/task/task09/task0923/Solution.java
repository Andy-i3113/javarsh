package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = reader.readLine().replaceAll("\\s+", "").toCharArray();
        String gl="";
        String sogl="";
        for (char ch : chars) {
            if (isVowel(ch)) {
                gl = gl + ch + " ";
            } else {
                sogl = sogl + ch + " ";
            }
        }
        System.out.println(gl);
        System.out.println(sogl);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character){
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }



}