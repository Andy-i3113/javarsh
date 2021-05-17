package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {

        public static void main(String[] args) {
            System.out.println(getCountSeconds((3600*15)+(3600/2)));
        }

        public static int getCountSeconds(int seconds) {
            return seconds%3600;
        }
}


