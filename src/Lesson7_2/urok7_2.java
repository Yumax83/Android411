package Lesson7_2;

import java.util.Scanner;

public class urok7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int mas[] = new int[4];  //создание массива
//        int[] mas2 = new int[5];  // создание массива вариант записи номер 2
//        int mas3[];       //3 вариант
//        mas3 = new int[4];
//        System.out.println(mas[3]); // 4 елемент в массиве (0-3)
        // 5 вариант c указанием количества элементов и значений
//        int mas [] = new int[]{2,7,5,3};
//        System.out.println(mas[0]);
//        System.out.println(mas[1]);
//        System.out.println(mas[2]);
//        System.out.println(mas[3]);
        // 6 вариант сразу указываем значения, а значит и количество элементов
//        int mas [] = {2,7,5,3};
//        System.out.println(mas[0]);
//        System.out.println(mas[1]);
//        System.out.println(mas[2]);
//        System.out.println(mas[3]);
        // ввод с клавиатуры
//        int mas[] = new int[4];
//        mas[0] = 5;
//        mas[1] = 6;
//        mas[2] = mas[0] + mas[1]; //можно делать вычисления
//        mas[3] = 5 + 5; // любые вычисления
//        System.out.println(mas[0]);
//        System.out.println(mas[1]);
//        System.out.println(mas[2]);
//        System.out.println(mas[3]);
//        System.out.println(mas.length); // Длина массива

//        int last=mas[mas.length-1];
//        System.out.println(last);  // присваивание и вывод индекса (элемента) массива
        // вывод с использованием цикла
//        for (int i = 0; i < mas.length; i++) {  // или так
//            System.out.println(mas[i]);
//        int n = 10;
//        //int[] mas = new int[n*2+3];
//        int[] mas = new int[n];
//        System.out.println(mas.length);
//        mas[n - 1] = 2; // mas [9]=2;
//        mas[n - 2] = 3; // mas [8]=3;
//        mas[1] = 6;
//        mas[n / 5] = mas[n - 1] + mas[n - 2]; // mas [2]=5;
//        for (int i = 0; i < mas.length; i++) {
//            System.out.print(mas[i] + " ");
//        }
        // c клвиатуры
        // int[] array = new int[4];
//        System.out.println("->");
//        array[0] = input.nextInt();
//        System.out.println("->");
//        array[1] = input.nextInt();
//        System.out.println("->");
//        array[2] = input.nextInt();
//        System.out.println("->");
//        array[3] = input.nextInt();
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("->");
//            array[i] = input.nextInt();
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
        int n;
        System.out.println("Введите длину: ");
        n = input.nextInt();
        int[] array;
        if (n < 5) {
            array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
            }
        } else {
            array = new int[n];
        }
        for (int i = 0; i <  array.length; i++) {
            System.out.println(array[i]+ "");
            
        }
    }
//            System.out.println("->");
//            array[i] = input.nextInt();
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
}



