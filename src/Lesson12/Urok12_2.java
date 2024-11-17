package Lesson12;

import java.util.Scanner;

public class Urok12_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // перегрузка методов (название одинаковое, типы разные)
        // Виды перегруза
        //1. По количеству параметров (аргументов)
        //2. По типам параметров

        //3. по порядку передаваемых параметров
//        int yyyyy=1;
////        int a = 7;
////        int b = 3;
////        double c = 5.1;
////        double d = 7.2;
////        int res1 = min(a, b);
////        double res2 = min(c, d);
////        System.out.println(res1);
////        System.out.println(res2);
////        int num = 4;
////        String str = "2 x 2 =";
////        print(str);
////        print(num);
////        print(str, num);
//        int a = 7, b = 3, c = 5;
//        int res1 = sum(a,b);
//        int res2= sum (a,b,c);
//        System.out.println("Summa 2 chisel: "+res1);
//        System.out.println("Summa 3 chisel: "+res2);

    }
    public static int sum(int n1, int n2){
        return n1+n2;
    }
    public static int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }


    public static void print(String text) {
        System.out.println(text);
    }

    public static void print(int number) {
        System.out.println(number);
    }

    public static void print(String text, int number) {
        System.out.println(text + " " + number);
    }

    public static int min(int n1, int n2) {
        int min;
        if (n1 > n2) min = n2;
        else min = n1;
        return min;
    }

    public static double min(double n1, double n2) {
        double min;
        if (n1 > n2) min = n2;
        else min = n1;
        return min;
    }
}


