package Lesson4;

import java.util.Scanner;

public class DZ4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число от 1 до 99: ");
        int chislo = input.nextInt();
        if (chislo > 0 && chislo <= 99) {
            int a = chislo;
            a %= 10;
            if (chislo >= 11 && chislo <= 19 || a == 0 || a > 4)
                System.out.println(chislo + " копеек");
            else if (a == 1)
                System.out.println(chislo + " копейка");
            else
                System.out.println(chislo + " копейки");
        } else
            System.out.print("Ошибка ввода данных");
        input.close();
    }
}

