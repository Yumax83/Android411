package Lesson6;

import java.util.Scanner;

public class DZ6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Программа выводит на экран линию из символов. Необходимо ввести параметры.");
        System.out.print("Введите количество символов: ");
        int symbol_count = input.nextInt();
        input.nextLine();
        System.out.print("Введите тип символа: ");
        String symbol_type = input.next();
        System.out.print("Укажите ориентацию линии (введите '1' для горизонтальной / введите '2' для вертикальной): ");
        int symbol_orientation = input.nextInt();
        if (symbol_orientation == 1 || symbol_orientation == 2) {
            for (int i = 0; i < symbol_count; i++) {
                System.out.print(symbol_orientation == 1 ? symbol_type : symbol_type + "\n");
            }
        } else System.out.println("Не правильно указано 'число' выбора ориентации линии, попробуйте снова.");
    }
}


