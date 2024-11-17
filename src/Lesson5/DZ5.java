package Lesson5;

import java.util.Scanner;

public class DZ5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество часов: ");
        int chas = input.nextInt();
        switch ((chas >= 0 && chas < 6) ? 1 :
                (chas >= 6 && chas < 13) ? 2 :
                        (chas >= 13 && chas < 17) ? 3 :
                                (chas >= 17 && chas < 24) ? 4 : 0) {
            case 1 -> System.out.println("Доброй ночи!");
            case 2 -> System.out.println("Доброе утро!");
            case 3 -> System.out.println("Добрый день!");
            case 4 -> System.out.println("Добрый вечер!");
            case 0 -> System.out.println("Такого часа нет, попробуйте снова!");
        }
   }
}
