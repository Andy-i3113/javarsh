package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> it =  cats.iterator();
        if (it.hasNext())
            cats.remove(it.next());
        //Написать тут ваш код. step 3 - пункт 3


        printCats(cats);
    }

    public static Set<Cat> createCats() {

        Set<Cat> cats = new HashSet<Cat>();

        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (int i=0; i<cats.size();i++)
        {
            System.out.println(cats);
        }
    }

    // step 1 - пункт 1

    public static class Cat {




    }
}
