package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {

        SpecialThread task1 = new SpecialThread();
        SpecialThread task2 = new SpecialThread();
        SpecialThread task3 = new SpecialThread();
        SpecialThread task4 = new SpecialThread();
        SpecialThread task5 = new SpecialThread();

        list.add(new Thread(task1));
        list.add(new Thread(task2));
        list.add(new Thread(task3));
        list.add(new Thread(task4));
        list.add(new Thread(task5));

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
