package Lesson6;

import java.util.Scanner;

public class urok6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int sum = 0, num, count = 0;
//        float average;
//        do {
//            System.out.print("Введите число: ");
//            num = input.nextInt();
//            if (num<0){
//            sum += num;
//            count++;}
//        } while (num != 0);
//        average= (float) sum/count;
//          System.out.printf("Среднее: %.2f",average);
//        int number, copy, revers = 0;
//        System.out.print("Введите число: ");
//        number = input.nextInt(); //321
//        copy = number;
////        System.out.println("number" + number);
////        System.out.println("copy" + copy);
//        do {
//            revers *= 10;
//            revers += (copy % 10);
//            copy /= 10;
//        } while (copy > 0);
//        System.out.println("Число " + number + ((number == revers) ? " " : " не ") + "палиндром");

//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            if (i==5){
//                break; // прерывает весь цикл
//            }
//            i++;
//        }
//        System.out.println("цикл завершен");

//        int i = 0;
//        while (i < 10) {
//            if (i == 3) {
//                i++;
//                continue; // прерывает текущую итерацию в цикле все что ниже по коду
//            }
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//            i++;
//        }
//        System.out.println("цикл завершен");

//        int n = 0, proizv = 0;
//        while (true) {
//            System.out.print("Введите число: ");
//            n = input.nextInt();
//            if (n == 0) break;
//            if (proizv == 0) proizv++;
//            proizv *= n;
//        }
//        System.out.println("Произведение чисел : " + proizv);
//        input.close();
//        int i = 1;
//        while (i < 5) {
//            System.out.println("Внешний цикл: i = " + i);
//            int j = 1;
//            while (j < 4) {
//                System.out.println("\tВнутренний цикл: j = " + i);
//                j++;
//            }
//            i++;
//        }
//        int i = 1;
//        while (i < 10) {
//            int j = 1;
//            while (j < 10) {
//                System.out.print(i + " * " + j + " " + " = " + (i * j)+ "\t\t");
//                j++;
//            }
//            i++;
//            System.out.println("");
//        }
//        int i = 0;
//        while (i < 3) {
//            int j = 0;
//            while (j < 6) {
//                System.out.print("^");
//                j++;
//            }
//            i++;
//            System.out.println("");
//        }
//        int i = 0;
//        while (i < 5) {
//            int j = 0;
//            while (j < 16) {
//                if (i % 2 == 0) {
//                    System.out.print("+");
//                } else  System.out.print("-");
//                j++;
//            }
//            i++;
//            System.out.println("");
//        }
//        int i = 0;
//        while (i < 5) {
//            int j = 0;
//            while (j < 16) {
//                System.out.print(i % 2 == 0 ? "+" : "-");
//                j++;
//            }
//            i++;
//            System.out.println("");
//        }
//        int i = 0;
//        while (i < 5) {
//            int j = 0;
//            while (j < 5) {
//                System.out.print(i == j ? "*" : "   ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // FOR цикл      for (инциализация переменной; условие; шаг цикла)

//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//        int i=0;
//        for (; i < 5;) {
//            System.out.println(i);
//            i++;
//        }
//        int i=0;
//        for (;;) {
//            System.out.println(i);
//            if (i==4)
//                break;
//            i++;
//        }
//        int count=0;
//        for (int i = 0; i < 6; i++){
//            System.out.print("-> ");
//            if (input.hasNext()){
//                count++;
//            }
//            input.nextLine();
//        }
//        System.out.println("Ввели количество чисел "+count);
//    }
        int count = 0;
        System.out.print("-> ");
        count = input.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        input.nextLine();
    }

}


