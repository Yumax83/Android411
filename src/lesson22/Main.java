package lesson22;

public class Main {
    public static void main(String[] args) {
        Calculation obj = new Calculation();
        // 1. Способ перегрузка метода по количеству параметров (одинаковых типов)
        obj.calculate(1, 2);
        obj.calculate(1, 2, 3);

        // 2. Перегрузка по типам параметров
        obj.calculate(2.5, 3.4);

        // 3. По порядку параметров
        obj.calculate(2.5, 3);
        obj.calculate(2, 3.3);

    }
}

class Calculation {
    public void calculate(int a, int b) {
        System.out.println("Сумма двух целых: " + (a + b));
    }

    public void calculate(int a, int b, int c) {
        System.out.println("Сумма трех целых: " + (a + b + c));
    }

    public void calculate(double a, double b) {
        System.out.println("Сумма двух вещественных: " + (a + b));
    }

    public void calculate(double a, int b) {
        System.out.println("В результате вещественное число: " + (a + b));
    }
    public void calculate(int a, double b) {
        System.out.println("В результате целое число: " + (int)(a + b));
    }
}
