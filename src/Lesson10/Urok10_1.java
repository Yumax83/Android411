package Lesson10;

import java.util.Scanner;

public class Urok10_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = 5.55f;
//        System.out.println(Math.round(num));
//        System.out.println(Math.floor(num));
//        System.out.println(Math.ceil(num));
//        System.out.println(Math.sqrt(4));
//        System.out.println(Math.pow(4,2));
//        System.out.println(Math.PI);
//        System.out.println(Math.pow(4,(4)));
//        System.out.print("Введите катет 1: ");
//        int с1= input.nextInt();
//        System.out.print("Введите катет 2: ");
//        int c2=input.nextInt();
//        System.out.printf("Гипотенуза : %.2f",Math.sqrt(Math.pow(с1,2)+Math.pow(c2,2)));
//        hello("Irina");
//        hello("Igor");
        getSum(2, 5);
        int a=1;
        int b=7;
        getSum(a,b);
        int n=1;
        int m=6;
        getSum(n,m);
    }

    public static void getSum(int a, int b) {
        System.out.println("Сумма: " + (a + b));
    }

    public static void hello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
