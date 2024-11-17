package Lesson12;

import java.util.Scanner;

public class DZ12 {
    public static void main(String[] args) {
        System.out.println("Закрашиваем квадрат символами");
        zakrashka(getNum());
    }

    public static int getNum() { //метод - получение и проверка числа
        Scanner input = new Scanner(System.in);
        System.out.print("Введите длину стороны (целое число): ");
        if (input.hasNextInt()){
            return Math.abs(input.nextInt()); // возвращаем по модулю в случае ввода отрицательного числа (чтобы не проверять в дальнейшем)
        } else{
            System.out.println("Ошибка при вводе. Повторите ввод.");
            return getNum();
        }
    }

    public static void zakrashka(int n) { //метод закрашивание квадрата
        if (n > 2) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n * 2; j++) {
                    if (i == 1 || i == n) {
                        System.out.print("=");
                    } else if (j == 1 || j == n * 2) {
                        System.out.print("=");
                    } else {
                        if (j % 2 == 0)
                            System.out.print("\\");
                        else System.out.print("/");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Вы ввели слишком короткую сторону - квадрат не будет прорисован, пожалуйста введите длину стороны не менее 3 единиц.");
            zakrashka(getNum());
        }
    }
}
