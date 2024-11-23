package Lesson14;

import java.util.InputMismatchException;
import java.util.Scanner;

// работа с исключениями
public class urok14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        try { //попытаться
//            System.out.print("Введите первое число: ");
//            int a = input.nextInt();
//            System.out.print("Введите второе число: ");
//            int b = input.nextInt();
//            System.out.println(a / b);
//        } catch (InputMismatchException e) {  //поймать
//            System.out.println("Вы ввели не целое число: " + e);
//        } catch (ArithmeticException e) {
//            System.out.println("Делить на ноль нельзя " + e);
//        }
//        try { //попытаться
//            System.out.print("Введите первое число: ");
//            int a = input.nextInt();
//            System.out.print("Введите второе число: ");
//            int b = input.nextInt();
//            System.out.println(a / b);
//        } catch (InputMismatchException | ArithmeticException e) {  //поймать
//            System.out.println("Вы ввели не целое число: " + e);
//            System.out.println("Делить на ноль нельзя " + e);
//        } finally {
//            System.out.println("Конец программы");
//        }
//        try {
//            int[] numbers = new int[3];
//            numbers[3] = 9;
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Введен не корректный индекс - " + e);
//        }
        // факториал числа
//        int res = getFactorial(-5);
//        System.out.println(res);


//    public static int getFactorial(int num) {
//        int mul = 1;
//        try {
//            if (num < 1) {
//                throw new Exception("Число меньше единицы указывать нельзя");
//            }
//            for (int i = 1; i <= num; i++) {
//                mul *= i;
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//            mul=num;
//        }
//        return mul;
//        String str1 = "Hello";
//        String str2 = "World";
//        str2 = str2 + "!";
//        String message = str1 + " " + str2;
//        System.out.println(message);
//    char[] helloArray = {'П','р', 'и', 'в', 'е', 'т'};
//    String helloString = new String(helloArray);
//        System.out.println(helloString);

//        String str1 = "Hello";
//        int a = 5;
//        String message = str1 + " " + a;
//        System.out.println(message);

//        String str1 = "2";
//        int a = 5;
//        String message = str1 + a;
//        System.out.println(message);

//        // ЧИСЛО В СТРОКУ (конкатенация)
//        int a = 5;
//        String message = " " + a;
//        System.out.println(message); // 5 строка

//        // СТРОКУ в ЧИСЛО
//        String str1 = "2";
//        int a = 5;
//        int b = Integer.parseInt(str1); // функция преобразования
//        int message = b + a;
//        System.out.println(message); // 7 сумма а не конкатенация

//        String str1 = "2";
//        int a = 5;
//        int message = Integer.parseInt(str1) + a;
//        System.out.println(message);

//        String str1 = "Hello";
//        int count = (str1 +57).length();
//        System.out.println(count);

//        String name = "NiKita";
//        String name2 = name.toLowerCase(); // в нижний регистр
//        System.out.println(name2);

//        String name = "NiKita";
//        String name2 = name.toUpperCase(); // в верхний регистр
//        System.out.println(name2);

//        String s = "Я буду хорошим программистом";
//        char res=s.charAt(1);
//        System.out.println(res);
        String s = "я буду хорошим программистом";
        int[] result = new int['я' - 'а' + 1];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
             if (ch >= 'а' && ch <= 'я') {
                result[ch - 'а']++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println((char) (i + 'а') + "=" + result[i]);
        }
    }
}

