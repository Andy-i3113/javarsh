package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        LatteMaker a = new LatteMaker();
        TeaMaker b = new TeaMaker();
        a.makeDrink();
        b.makeDrink();
    }
}
