package Lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Urok11_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        symbolDraw(9, '+', '-');
//        symbolDraw(23,'@','*');
//        int a = 30;
//        int b = 45;
//        System.out.println("Перед вызовом метода:\na=" + a + "\nb=" + b);
//        swapFunc(a,b);
//        System.out.println("После вызова метода:\na=" + a + "\nb=" + b);
//        int a = 11;
//        int b = 22;
        //int c = min(a, b);
        //System.out.println("Минимальное значение: " + c);
        // esLI(a,b);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = est1(a, b);
//        System.out.println(c);
        //System.out.println("Rez = " + es(a, b));
        // est(a,b);
//        for (int i = 1; i < 11; i++) {
//            System.out.println(i+ " в кубе = " + kub(i));
//
//        }
//        int n=5;
//        for (int i = 0; i <= n; i++) {
//            printline(1,i);
//        }
//        for (int i = n-1; i > 0; i--) {
//            printline(1,i);
//        }
//        sum(1, 2, 3);
//        sum(1, 2, 3, 4, 5);
//        sum();
//        sum_str("Сумма двух чисел: ", 20, 10);
//        sum_str("Сумма трех чисел: ", 20, 10, 3);
//        sum_str("Сумма: ");
//        find_num(2, 7, 0, 3, 1, 5, -13);
//        find_num(2, 7, 0, 3, 1, 5, -13, 13);
//        find_num(26);
//        find_num(99, 99, 100, 34, -39);
//        find_num(99, 39, 99, 100, 34);

        System.out.println(ch(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(ch(3, 6, 1, 9, 5));
    }

    public static ArrayList ch(int... args) {
        ArrayList<Integer> mas = new ArrayList<>();
        float sum = 0;
        int count = 0;
        float average;
        for (int i : args) {
            sum += i;
            count++;
        }
        average = sum / count;
        System.out.print("Среднее арифметическое: " + average + "\n");
        for (int i : args) {
            if (i < average)
                mas.add(i);
        }
        return mas;
    }

    public static void find_num(int... v) {
        int max = 0;
        for (int j : v) {
            if (j % 13 == 0 && j > 0) {
                if (max < j)
                    max = j;
            }
        }
        System.out.println(max == 0 ? " Число не найдено" : max);
    }

    public static void sum_str(String message, int... num) {
        int res = 0;
        for (int i = 0; i < num.length; i++) {
            res += num[i];
        }
        System.out.print(message);
        System.out.println(res);
    }

    public static void sum(int... num) {
        int res = 0;
//        for (int n:num)
//            res+=n;
        for (int i = 0; i < num.length; i++) {
            res += num[i];
        }
        System.out.println(res);
    }

    public static void printline(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int kub(int a) {
        return a * a * a;
    }

    public static int es(int a, int b) {
        if (a > b)
            return a - b;
        else return a + b;
    }

    public static int esLI(int n1, int n2) {
        int chislo;
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input.nextInt();
        if (n1 > n2) chislo = n2 - n1;
        else chislo = n2 + n1;
        return chislo;
    }

    public static void est(int a, int b) {
        System.out.print("Rez " + (a > b ? (a - b) : (a + b)));
    }

    public static int est1(int a, int b) {
        return (a > b ? (a - b) : (a + b));
    }

    public static int min(int n1, int n2) {
        int minCh;
        if (n1 > n2) {
            minCh = n2;
        } else {
            minCh = n1;
        }
        System.out.println("Hello");
        return minCh;
    }


    public static void swapFunc(int a, int b) {
        System.out.println("До:\na=" + a + "\nb=" + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("После:\na=" + a + "\nb=" + b);
    }

    public static void symbolDraw(int count, char a, char b) {
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0)
                System.out.print(a);
            else
                System.out.print(b);
        }
    }


    public static void getSum(int a, int b) {
        System.out.println("Сумма: " + (a + b));
    }


}
