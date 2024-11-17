package Lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Urok9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String[] cities = {"Брянск", "Иркутск", "Владивосток", "Армавир"};
//        System.out.println(Arrays.toString(cities));
//        String[] cities2 = new String[cities.length+1];
//        System.out.println(Arrays.toString(cities2));
//        ArrayList<String> cities = new ArrayList<>();
//        cities.add("Брянск");
//        cities.add("Иркутск");
//        cities.add("Владивосток");
//        cities.add("Армавир");
//        cities.add(1, "Красноярск");
//        System.out.println(cities);
//        System.out.println(cities.get(2));
//        cities.set(2, "Курск");
//        System.out.println(cities.size());
////        for (String city : cities) {
////            System.out.print(city + "\t");
////        }
//        System.out.println("\n" + cities.indexOf("Владивосток"));
//        System.out.println(cities.contains("Курск"));
//        if (cities.contains("Курск")){
//            System.out.println("Лист содержит Курск");
//        }
//        cities.remove(1); //удалить
//        cities.remove("Владивосток");
//        for (int i = 0; i < cities.size(); i++) {
//            System.out.print(cities.get(i)+"\t");

//        int n, k;
//        ArrayList<Integer> mas = new ArrayList<>();
//        System.out.println("Введите элементы списка: ");
//        while ((n = input.nextInt()) > 0) {
//            mas.add(n);
//        }
//        System.out.println(mas);
//        System.out.println("Введите индекс: ");
//        k=input.nextInt();
//        mas.remove(k);
//        System.out.println(mas);
//        int max, ind;
//        ArrayList<Integer> mas = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            mas.add((int) (Math.random() * 100));
//        }
//        for (int m : mas) {
//            System.out.print(m + "\t");
//        }
//        max = mas.get(0);
//        for (int i = 0; i < 10; i++) {
//            if (mas.get(i) > max) {
//                max = mas.get(i);
//            }
//        }
//        System.out.println("\nMax: " + max);
////        ind = mas.indexOf(max);
////        mas.remove(ind);
//        mas.remove(mas.indexOf(max));
//        mas.add(0, max);
//        System.out.println(mas);
//        for (int m : mas) {
//            System.out.print(m + "\t");
//    }
//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
//        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55));
//        ArrayList<Integer> c = new ArrayList<>();
//
//        System.out.println(a);
//        System.out.println(b);
//        for (int i = 0; i < a.size(); i++) {
//            c.add(a.get(i));
//            c.add(b.get(i));
//        }for (int i = a.size(); i < b.size(); i++) {
//            c.add(b.get(i));
//        }
//
////        for (int i = 0; i < b.size(); i++) {
////            if (i < a.size()) {
////                c.add(a.get(i));
////            }
////            if (i < b.size()) {
////                c.add(b.get(i));
////            }
//        System.out.println(c);
        int[][] num = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//        System.out.println(num[1][3]);
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(Arrays.toString(num[i]));
//        }
        //System.out.println(Arrays.toString(num));
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j]= num[i][j]*num[i][j];
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

