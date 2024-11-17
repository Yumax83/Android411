package Lesson3;

import java.util.Scanner;

public class DZ3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// ПОИСК МЕТОДОВ ОПРЕДЕЛЕНИЯ ДЛИНЫ ЧИСЛА УВЕЛ ДАЛЕКО ))        
// ВВЕСТИ С КЛАВИАТУРЫ ЗАДАННОЕ ЧИСЛО. НАЙТИ КОЛИЧЕСТВО ЦИФР, ПРОИЗВЕДЕНИЕ ЕГО ЦИФР И НАЙТИ ЕГО СРЕДНЕЕ АРИФМЕТИЧЕСКОЕ
        System.out.print("Введите число: ");
        int chislo = input.nextInt();
        int numDigits = (int) Math.log10(chislo) + 1;
        System.out.println("В заданном значении: " + numDigits + " цифр");
        int i = 1, proiz = 1, sum = 0, c, nomer=numDigits;
        while (i <= numDigits) {
            c = chislo % 10;
            chislo = chislo / 10;
            proiz = proiz * c;
            sum = sum + c;
            i++;
            System.out.println("Цифра № " + (nomer) + " имеет значение " + c);
            nomer = nomer - 1;
        }
        System.out.printf("Произведение = %.0f ", + (double)proiz);
        System.out.printf("Сумма = %.0f ", + (double)sum);
        System.out.printf("Среднее арифметическое = %.2f ", +(double) sum / numDigits);
        input.close();
    }
}
