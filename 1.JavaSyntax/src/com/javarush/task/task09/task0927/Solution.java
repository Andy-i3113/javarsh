package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
       Map<String, Cat> animal = new Map<String, Cat>() {
           @Override
           public int size() {
               return 0;
           }

           @Override
           public boolean isEmpty() {
               return false;
           }

           @Override
           public boolean containsKey(Object key) {
               return false;
           }

           @Override
           public boolean containsValue(Object value) {
               return false;
           }

           @Override
           public Cat get(Object key) {
               return null;
           }

           @Override
           public Cat put(String key, Cat value) {
               return null;
           }

           @Override
           public Cat remove(Object key) {
               return null;
           }

           @Override
           public void putAll(Map<? extends String, ? extends Cat> m) {

           }

           @Override
           public void clear() {

           }

           @Override
           public Set<String> keySet() {
               return null;
           }

           @Override
           public Collection<Cat> values() {
               return null;
           }

           @Override
           public Set<Entry<String, Cat>> entrySet() {
               return null;
           }
       };

        animal.put("one1",new Cat("Gif1"));
        animal.put("one2",new Cat("Gif2"));
        animal.put("one3",new Cat("Gif3"));
        animal.put("one4",new Cat("Gif4"));
        animal.put("one5",new Cat("Gif5"));
        animal.put("one6",new Cat("Gif6"));
        animal.put("one7",new Cat("Gif7"));
        animal.put("one8",new Cat("Gif8"));
        animal.put("one9",new Cat("Gif9"));

        return animal;

    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
       Set<Cat> cats = new Set<Cat>() {
           @Override
           public int size() {
               return 0;
           }

           @Override
           public boolean isEmpty() {
               return false;
           }

           @Override
           public boolean contains(Object o) {
               return false;
           }

           @Override
           public Iterator<Cat> iterator() {
               return null;
           }

           @Override
           public Object[] toArray() {
               return new Object[0];
           }

           @Override
           public <T> T[] toArray(T[] a) {
               return null;
           }

           @Override
           public boolean add(Cat cat) {
               return false;
           }

           @Override
           public boolean remove(Object o) {
               return false;
           }

           @Override
           public boolean containsAll(Collection<?> c) {
               return false;
           }

           @Override
           public boolean addAll(Collection<? extends Cat> c) {
               return false;
           }

           @Override
           public boolean retainAll(Collection<?> c) {
               return false;
           }

           @Override
           public boolean removeAll(Collection<?> c) {
               return false;
           }

           @Override
           public void clear() {

           }



       };
       return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
