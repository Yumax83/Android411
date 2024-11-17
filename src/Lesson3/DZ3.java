package Lesson3;

import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ВВЕСТИ С КЛАВИАТУРЫ ЗАДАННОЕ 5 ЗНАЧНОЕ ЧИСЛО. НАЙТИ ПРОИЗВЕДЕНИЕ ЕГО ЦИФР И НАЙТИ ЕГО СРЕДНЕЕ АРИФМЕТИЧЕСКОЕ
        System.out.print("Введите пятизначное число: ");
        int chislo = input.nextInt();
        int a, a1, a2, a3, a4, a5;
        a = chislo;
        a1 = a % 10;
        a = a / 10;
        a2 = a % 10;
        a = a / 10;
        a3 = a % 10;
        a = a / 10;
        a4 = a % 10;
        a = a / 10;
        a5 = a % 10;
        System.out.println("Произведение цифр числа " + chislo + ": " + a1 * a2 * a3 * a4 * a5);
        System.out.printf("Среднее арифметическое числа " + chislo + ": %.1f", +((double) (a1 + a2 + a3 + a4 + a5) / 5));
        System.out.println();
        input.close();
    }
}
