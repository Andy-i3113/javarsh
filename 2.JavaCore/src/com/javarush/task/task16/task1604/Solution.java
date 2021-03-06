package com.javarush.task.task16.task1604;

/* 
Вывод стек-трейса
*/

public class Solution {
    public static class  SpecialThread implements Runnable{

        /**
         * When an object implementing interface <code>Runnable</code> is used
         * to create a thread, starting the thread causes the object's
         * <code>run</code> method to be called in that separately executing
         * thread.
         * <p>
         * The general contract of the method <code>run</code> is that it may
         * take any action whatsoever.
         *
         * @see Thread#run()
         */
        @Override
        public void run() {

            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();


        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }
}
