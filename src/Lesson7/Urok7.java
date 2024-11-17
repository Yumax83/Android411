package Lesson7;

import java.util.Scanner;

public class Urok7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Программа выводит на экран линию из символов. Необходимо ввести параметры.");
//        System.out.print("Введите количество символов: ");
//        int symbol_count = input.nextInt();
//        input.nextLine();
//        System.out.print("Введите тип символа: ");
//       //  char symbol_type = input.next().charAt(0); 1 вариант
//        char symbol_type = input.next().charAt(0);
//        System.out.print("Укажите ориентацию линии (введите '1' для горизонтальной / введите '2' для вертикальной): ");
//        int symbol_orientation = input.nextInt();
//        if (symbol_orientation == 1 || symbol_orientation == 2) {
//            for (int i = 0; i < symbol_count; i++) {
//                System.out.print(symbol_orientation == 1 ? symbol_type : symbol_type + "\n");
//            }
//        } else System.out.println("Не правильно указано 'число' выбора ориентации линии, попробуйте снова.");

//        System.out.print("Введите целое число: ");
//        //int chislo = input.nextInt();
//        for (int i = 10; i < 100; i++) {
//            if (i / 10 == i % 10)
//                System.out.print(i + " ");
//        }
//        int a = 0;
//        for (int i = 5; i > 0; i--, a++) {
//            System.out.print("Шаг " + a + " Значение ");
//            System.out.println(i);
//        }
//        int w, h;
//        System.out.print("Введите ширину прямоугольника: ");
//        w = input.nextInt();
//        System.out.print("Введите высоту прямоугольника: ");
//        h = input.nextInt();
//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < w; j++) {
//                if (i == 0 || i == h - 1 || j == 0 || j == w - 1)
//                    System.out.print("*");
//                else System.out.print(" ");
//            }
//            System.out.println();
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int a = 0; a < 8; a++) {
            for (int b = 0; b < 8; b++) {
                if (a >= b) System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int c = 0; c < 8; c++) {
            for (int d = 0; d < 8; d++) {
                if (c <= d) System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int e = 8; e > 0; e--) {
            for (int f = 0; f < e; f++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}


