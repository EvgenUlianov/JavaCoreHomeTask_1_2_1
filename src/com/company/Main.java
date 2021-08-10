package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1: Работа с числами");

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        StreamMain.doStreamMain(intList);

        //List<Integer> secondList = new ArrayList<>();
        Integer[] secondList = new Integer[intList.size()];

        int index = 0;
        for (Integer x : intList) {
            if (x > 0)
                if (x % 2 == 0)
                    secondList[index++] = x.intValue();
        }

        int[] thirdList = new int[index];
        for (int i = 0; i < index ; i++)
            thirdList[i] = secondList[i];


        for (int i = 0; i < index ; i++) {
            for (int j = 0; j < i; j++) {
                if  (thirdList[j] > thirdList[i]) {
                    Integer a = thirdList[j];
                    thirdList[j] = thirdList[i];
                    thirdList[i] = a;
                }
            }
        }

        for (int x : thirdList) {
            System.out.println(x);
        }

    }
}
