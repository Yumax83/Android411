package Lesson15;

import java.util.Scanner;

public class DZ15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку для проверки на палиндром: ");
        try {
            String str = input.nextLine().toLowerCase().replaceAll("(?U)\\W", "");
            if (str.isEmpty()) {
                throw new Exception("Строка пустая. Попробуйте снова.");
            }
            char[] res = str.toCharArray();
            for (int i = 0; i < res.length; i++) {
                res[i] = str.charAt(str.length() - 1 - i);
            }
            String str2 = new String(res);
            if (str.equals(str2)) {
                System.out.println("Введенная строка является палиндромом");
            } else {
                System.out.println("Введенная строка не является палиндромом");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println();
            System.out.println("Конец программы");
        }
    }
}
