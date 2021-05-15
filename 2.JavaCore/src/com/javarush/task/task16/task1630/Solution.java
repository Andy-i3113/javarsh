package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static {
        try {
            System.out.print("First file name: ");
            firstFileName = reader.readLine();
            System.out.print("Second file name: ");
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    //add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    private static class ReadFileThread extends Thread implements ReadFileInterface {
        @Override
        public void setFileName(String fullFileName) {

        }

        @Override
        public String getFileContent() {
            return null;
        }

        @Override
        public void join() throws InterruptedException {

        }

        @Override
        public void start() {

        }
    }

    //add your code here - добавьте код тут
}
