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


//        самое длинное слово через цикл

        String maxString = str1Array[0];
        for (String word : str1Array) {
            System.out.println(maxString);
            if (maxString.length() <= word.length()) {
                maxString = word;
            }
        }
        System.out.println("Максимальное слово - " + maxString);

        //        самое короткое слово через цикл

        String minString = str1Array[0];
        for (int i1 = 0; i1 < str1Array.length; i1++) {
            System.out.println(minString);
            if (minString.length() >= str1Array[i1].length()) {
                minString = str1Array[i1];
            }
        }
        System.out.println("Минимальное слово - " + minString);

//        самое длинное и короткое слово через компаратор

        Comparator<String> stringComparator = new Compare();
        Arrays.sort(str1Array, stringComparator);
        System.out.println(str1Array[0]);
        System.out.println(str1Array[str1Array.length-1]);


        for (int letters = 0; letters < 10; letters++) {
            for (String words : str1Array) {
                if (words.length() <= letters) {
                    System.out.println(words); break;
                }
            }
        }
    }
}
