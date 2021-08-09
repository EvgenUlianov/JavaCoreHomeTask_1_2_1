package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1: Работа с числами");

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        StreamMain.doStreamMain(intList);

        List<Integer> secondList = new ArrayList<>();

        for (Integer x : intList) {
            if (x > 0)
                if (x % 2 == 0)
                    secondList.add(x);
        }

        for (int i = 0; i < secondList.size() ; i++) {
            for (int j = 0; j < i; j++) {
                if  (secondList.get(j) >  secondList.get(i)) {
                    Integer a = secondList.get(j);
                    secondList.set(j, secondList.get(i));
                    secondList.set(i, a);
                }
            }
        }

        for (Integer x : secondList) {
            System.out.println(x);
        }

    }
}
