package com.javarush.task.task17.task1710;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        Person person;
        SimpleDateFormat dateFormat  = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
        SimpleDateFormat dateFormatPrt  = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);


        if (args[0].equals("-c")) {
            Date date = dateFormat.parse(args[3]);
            if (args[2].equals("м")) {
                 person = Person.createMale(args[1],date);
            }
            else {
                 person = Person.createFemale(args[1],date);
            }
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
        }

        if (args[0].equals("-u")) {





        }

        if (args[0].equals("-d")) {

        }

        if (args[0].equals("-i")) {

        }






        //start here - начни тут
    }
}
