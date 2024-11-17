package Lesson5;

import java.util.Scanner;

public class urok5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int a = 20, b = 8;
//        System.out.println(b == 0 ? "на ноль делить нельзя" : (float) a / b); //ТЕРНАРНЫЙ ОПЕРАТОР
//        int n = true ? (false ? 10 : 20) : 30;
//        System.out.println(n);

        //КОНСТРУКЦИЯ СВИТЧ (SWITCH)
//        int n;
//        System.out.println("\tВыбор цвета светофора\n1-красный, 2-желтый, 3-зеленый");
//        n = input.nextInt();
//        switch (n) {
//            case 1:
//                System.out.println("Стоим");
//                break;
//            case 2:
//                System.out.println("Приготовились");
//                break;
//            case 3:
//                System.out.println("Идем");
//                break;
//            default:
//                System.out.println("Такого цвета светофора нет"); // также default можно поставить в начале
//
//        }
//        int n;
//        System.out.println("\tВыбор цвета светофора\n1(11)-красный, 2(22)-желтый, 3(33)-зеленый");
//        n = input.nextInt();
//        switch (n) {
//            case 1: //кейсы
//            case 11:
//                System.out.println("Стоим");
//                break;
//            case 2:
//            case 22:
//                System.out.println("Приготовились");
//                break;
//            case 3:
//            case 33:
//                System.out.println("Идем");
//                break;
//            default:
//                System.out.println("Такого цвета светофора нет"); // также default можно поставить в начале
//        }
//        int m, g;
//        System.out.println("Ведите номер месяца");
//        m = input.nextInt();
//        switch (m) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.println("Количество дней 31");
//                break;
//            case 2:
//                System.out.println("Ведите год");
//                g = input.nextInt();
//                if (g % 4 == 0)
//                    System.out.println("Количество дней 29");
//                else System.out.println("Количество дней 28");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println("Количество дней 30");
//                break;
//            default:
//                System.out.println("Такого месяца нет");
//        }
//        int m;
//        System.out.println("Ведите номер месяца");
//        m = input.nextInt();
//        switch (m) {
//            case 1, 2, 12 -> {
//                System.out.print("Зима -");
//                System.out.println("холодно");
//            }
//            case 3, 4, 5 -> System.out.println("Весна");
//            case 6, 7, 8 -> {
//                System.out.print("Лето -");
//                System.out.println("жарко");
//            }
//            case 9, 10, 11 -> System.out.println("Осень");
//            default -> {
//                System.out.println("Такого месяца нет");
//                System.out.println("Попробуйте снова");
//            }
//        }
//        int m;
//        System.out.println("Ведите номер месяца");
//        m = input.nextInt();
//        String s = "";
//        switch (m) {
//            case 1, 2, 12 -> s = "Зима";
//            case 3, 4, 5 -> s= "Весна";
//            case 6, 7, 8 -> s= "Лето";
//            case 9, 10, 11 -> s= "Осень";
//            default -> s= "Такого месяца нет";
//        }
//        System.out.println(s);
//        int m;
//        System.out.println("Ведите номер месяца");
//        m = input.nextInt();
//        String s = switch (m) {          // возможность работать как тернарный оператор
//            case 1, 2, 12 -> "Зима";
//            case 3, 4, 5 -> "Весна";
//            case 6, 7, 8 -> "Лето";
//            case 9, 10, 11 -> "Осень";
//            default -> "Такого месяца нет";
//        };    //должна быть точка с запятой
//        System.out.println(s);
//        int start, finish, sum = 0;
//        System.out.print("Ведите начало диапозона: ");
//        start = input.nextInt();
//        System.out.print("Ведите конец диапозона: ");
//        finish = input.nextInt();
//        while (start <= finish) {         //while ЭТО ЦИКЛ С ПРЕДУСЛОВИЕМ
//            if (start % 2 != 0)
//                sum +=start;
//            start++;
//        }
//        System.out.println("Сумма нечетных чисел "+sum);

//        // DO WHILE ЦИКЛ С ПОСТУСЛОВИЕМ
//        int i = 0;
//        do {
//            System.out.println("i = " + i);
//            i++;
//        } while (i > 5);

        System.out.println("Введите бал по 12 системе: ");
        int num = input.nextInt();
        System.out.println("Ваш бал по 5 системе: ");
        switch ((num >= 1 && num <= 3) ? 2 :
                (num >= 4 && num <= 6) ? 3 :
                        (num >= 7 && num <= 9) ? 4 :
                                (num >= 10 && num <= 12) ? 5 : 0) {
            case 2 -> System.out.println(2);
            case 3 -> System.out.println(3);
            case 4 -> System.out.println(4);
            case 5 -> System.out.println(5);
            case 0 -> System.out.println("Такого значенте нет");


        }


    }
}