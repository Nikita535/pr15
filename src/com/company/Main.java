package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        //Task1
        System.out.println("Task1\n");
	    HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(10);
        hashSet.add(15);
        //в hashset нет дубликатов
        //не хранит порядок добавления элементов
        hashSet.add(15);
        hashSet.add(23);
        System.out.println("HashSet"+hashSet);

        TreeSet<Integer> treeSet=new TreeSet<>(hashSet);//преобразование hashset в treeset
        //выводит в отсортированном порядке
        //также нет дубликатов
        System.out.println("TreeSet"+treeSet);


        //Task2
        System.out.println("\nTask2\n");
        ExampleMap maptest=new ExampleMap();

        System.out.println("Количесвто Антонов = "+maptest.getSameFirstNameCount(maptest.createMap(),
                "Антон"));
        System.out.println("Количесвто Жизневских = "+maptest.getSameLastNameCount(maptest.createMap(),
                "Жизневский"));



    }
}
