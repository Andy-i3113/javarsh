package com.javarush.task.task15.task1525;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static List<String> lines = new ArrayList<String>();

    static {


        Scanner sc = null;
        try {
            sc = new Scanner(new File(Statics.FILE_NAME));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(sc.hasNext()){
            lines.add(sc.nextLine());
        }
    }


    public static void main(String[] args) {
        System.out.println(lines);
    }
}
