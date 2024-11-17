package Lesson3;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class urok3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int num = input.nextInt();
//        System.out.println("Вы ввели число :" + num);
//        System.out.print("Имя: ");
//        String name = input.nextLine(); // используется если несколько слов
//        String name = input.next();     // используется первое слово до первого пробела
//        System.out.print("Возраст: ");
//        int age = input.nextInt();
////        System.out.print("Рост: ");
////        float height = input.nextFloat();
////        System.out.printf("Имя: %s. Возраст: %d. Рост: %.2f %n", name, age, height);
//        System.out.println(name+ " " +age);
//        input.close();
//        System.out.print("Возраст: ");
//        int age = input.nextInt(); // 26 \n машина отрабатывает перенос
//        input.nextLine(); // в int и float всегда эту строчку нужно использовать
//        System.out.print("Рост: ");
//        float height = input.nextFloat();
//        input.nextLine();
//        System.out.print("Имя: ");
//        String name = input.nextLine();
//        System.out.println(name + " " + height);
//        input.close();
// конфликт ввода строки после числа
        System.out.println("Введите 4 числа: ");
        System.out.print("1 число: ");
        int num1 = input.nextInt();
        input.nextLine();
        System.out.print("2 число: ");
        int num2 = input.nextInt();
        input.nextLine();
        System.out.print("3 число: ");
        int num3 = input.nextInt();
        input.nextLine();
        System.out.print("4 число: ");
        int num4 = input.nextInt();
        input.nextLine();
        System.out.println("\nСумма первых двух чисел: " + (num1+num2) + "\nСумма последних двух чисел: "+ (num3+num4));
        System.out.printf("Результат деления (суммы первых на сумму последних: %.2f ", +(float) (num1+num2) / (num3+num4));
        input.close();
    }

}
