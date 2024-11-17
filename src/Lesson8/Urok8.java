package Lesson8;

import java.util.Scanner;
import java.util.Arrays;

public class Urok8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("->");
//            array[i] = input.nextInt();
//        }
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.print(array[i] + " ");
//        }


//        int n;
//        int[] array;
//        int sum = 0;
//        System.out.print("n= ");
//        n = input.nextInt();
//        array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("->");
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0) {
//                sum += array[i]; //sum=sum+array[i]
//            }
//        }
//        System.out.println("Sum: " + sum);
        // ПОСИК МИНИМАЛЬНОГО ЗНАЧЕНИЯ В МАССИВЕ

//        int[] array = new int[5];
//        int min;
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        min = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println("min= " + min);
//        int n;
//        int[] array;
//        int sum = 0;
//        System.out.print("n= ");
//        n = input.nextInt();
//        array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("->");
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length-1; i++) {
//            if (array[i] <array[i+1] ) {
//                System.out.print(" " + array[i+1]);
//            }
//        }
//        int[] a1 = {1, 2, 3, 4};
//        int[] a2 = new int[a1.length+5];
//        for (int i = 0; i < a1.length; i++) {
//            a2[i] = a1[i];
//        }
//        for (int i = 0; i < a2.length; i++) {
//            System.out.print(a2[i]+" ");
//
//        }
//        double a = Math.random(); // рэндом формирует от 0 до 1 (не включая 1)
//        System.out.println(a);
//        //для генеации других
//        // (Math.random()*(max-min))+min
//        double a = Math.random() * 3; // [0;3) смещаем диапазон до 3,4,5 и т.д.
//        System.out.println(a);
////        double b = 2+ Math.random() * 5; // [2;7)
////        System.out.println(b);
//        double b = Math.random() * 5+2 ; // [2;7)
//        System.out.println(b);
//        double d = Math.random() * 10 -5;
//        System.out.println(d);
//        int a = (int) (Math.random() * 7);
//        System.out.println(a);
//        int a = (int) (Math.random() * (10+1)) - 5; // [5;5]
//        System.out.println(a);
        // [-2;5)
//        int b = (int) (Math.random() * 7 - 2);
//        System.out.println(b);
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 12 + 2); // [2;14)
//        }
//        System.out.println(Arrays.toString(array));
//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 31 - 15); // [-15;16)
//        }
//        System.out.println(Arrays.toString(array));
//        int[] array = new int[10];
//        int acc = 0;
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 40 + 10); // [10;50]
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                sum = sum + array[i];
//            } else acc = acc + 1;
//        }
//        System.out.println("Acc = " + acc);
//        System.out.println("Sum = " + sum);
        // for (объявление переменной : выражение) {оперторы}
        // в этом стандартном примере обращение к индексу массива
//        int[] numbers = {10, 20, 30, 40, 50};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//        // в этом примере обращение к элементу массива
//        for (int x : numbers) { // 1 иттерация int x=10; 2-итеррация х=2- и т.д.
//            System.out.print(x + " ");
//        }
//        String[] names = {"Oleg","Ivan","Dima","July"};
//        for (String name : names) {
//            System.out.print(name + "\t");
//        }

        int[] array;
        int verh = 0, niz = 0;
        System.out.print("Введите нижнее значение диапазона: ");
        niz = input.nextInt();
        System.out.print("Введите верхнее значение диапазона: ");
        verh = input.nextInt();
        if (verh > niz) {
            array = new int[(verh - niz) + 1];
            for (int i = 0; i < array.length; i++) {
                array[i] = niz;
                niz++;
                System.out.print(array[i] + " ");  // вывод на экран записываемых элементов в массив в цикле
            }
            System.out.println("\n");
            for (int element : array) {    // вывод на экран после записывания элементов в массив через forech
                System.out.print(element + " ");
            }
            System.out.println("\n");
            System.out.println(Arrays.toString(array)); // вывод на экран элементов массива через функцию преобразования в строку
        } else System.out.println("Введено неверное значение верхнего диапазона. Попробуйте снова.");
    }
}



