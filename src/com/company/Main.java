package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 2. Дана строка произвольной длины с произвольными словами.
        //Найти самое короткое слово в строке и вывести его на экран.
        //Найти самое длинное слово в строке и вывести его на экран.
        //Если таких слов несколько, то вывести последнее из них.

        System.out.println("Введите слова через пробел");
        Scanner sc1 = new Scanner(System.in);
        String str1 = sc1.nextLine();
        String[] str1Array = str1.split(" ");

        Comparator<String> compare = new Compare();
        Arrays.sort(str1Array, compare);

        System.out.println(str1Array[0]);
        System.out.println(str1Array[str1Array.length-1]);

        for (int letters = 0; letters < 10; letters++) {
            for (String words : str1Array) {
                if (words.length() <= letters) {
                    System.out.println(words); return;
                }
            }
        }




    }
}
