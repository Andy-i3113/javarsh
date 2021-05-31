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

        // -u id name sex bd
        if (args[0].equals("-u")) {
            Date date = dateFormat.parse(args[4]);
            person = allPeople.get(Integer.parseInt(args[1]));
            if (args[3].equals("м")) {
                person.setSex(Sex.MALE);
            }
            else {
                person.setSex(Sex.FEMALE);
            }
            person.setBirthDate(date);
            person.setName(args[2]);
        }

        // -d id
        if (args[0].equals("-d")) {

            person = allPeople.get(Integer.parseInt(args[1]));
            person.setBirthDate(null);
            person.setSex(null);
            person.setName(null);

        }
        // -i id (Миронов м 15-Apr-1990)
        if (args[0].equals("-i")) {
            person = allPeople.get(Integer.parseInt(args[1]));
            String sex;
            if(person.getSex() == Sex.MALE) { sex="м"; } else {sex="ж";}
            System.out.println(person.getName()+" "+sex+" "+dateFormatPrt.format(person.getBirthDate()));
        }

    }
}
