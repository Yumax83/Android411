package Lesson12;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1 = getNumber();
        double num2 = getNumber();
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.printf("Результат: %.2f", result);

    }

    public static double calc(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return add(num1, num2);
            case '-':
                return sub(num1, num2);
            case '*':
                return mul(num1, num2);
            case '/':
                return div(num1, num2);
            default:
                return Double.NaN;
        }
    }

    public static double getNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        if (input.hasNextDouble()) {
            return input.nextDouble();
        } else {
            System.out.println("Ошибка при вводе. Повторите ввод.");
            return getNumber();
        }
    }

    public static char getOperation() {
        Scanner input = new Scanner(System.in);
        System.out.print("1-сумма\n2-разность\n3-произведение\n4-частое\nВыберите номер операции:");
        int operationNumber;
        if (input.hasNextInt()) {
            operationNumber = input.nextInt();
        } else {
            System.out.println("Вы ввели не число! Повторите ввод");
            return getOperation();
        }
        switch (operationNumber) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default:
                System.out.println("Введена неверная операция. Повторите ввод.");
                return getOperation();
        }
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    public static double mul(double num1, double num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        if (num2 != 0)
            return num1 / num2;
        else {
            System.out.println("На ноль делить нельзя");
            return Double.NaN;
        }
    }

}


