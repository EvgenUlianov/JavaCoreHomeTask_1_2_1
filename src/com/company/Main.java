package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1: Работа с числами");

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        new StreamMain(intList);

        Set<Integer> secondList = new TreeSet<>();
        for (Integer x : intList) {
            if (x > 0)
                if (x % 2 == 0)
                    secondList.add(x);
        }

        Iterator<Integer> key = secondList.iterator();
        while (key.hasNext()) System.out.println(key.next());



    }
}
