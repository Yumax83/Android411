package Lesson11;

import java.util.Scanner;

public class DZ11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Вычисление площади фигур. Выберите фигуру: ");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Прямоугольник");
        System.out.println("3 - Круг");
        System.out.print("->");
        int n = input.nextInt();
        switch (n) {
            case 1:
                area_triangle();
                break;
            case 2:
                area_rectangle();
                break;
            case 3:
                area_circle();
                break;
            default:
                System.out.println("Ошибка выбора фигуры. Попробуйте снова.");
        }
    }

    public static void area_triangle() {
        double a, h;
        Scanner input = new Scanner(System.in);
        System.out.println("Выбрана фигура: Треугольник"); // S = a *  h / 2
        System.out.print("Введите длину основания: ");
        a = input.nextDouble();
        System.out.print("Введите высоту: ");
        h = input.nextDouble();
        System.out.printf("Площадь треугольника = %.2f", a * h / 2);
    }

    public static void area_circle() {
        double r;
        Scanner input = new Scanner(System.in);
        System.out.println("Выбрана фигура: Круг"); // S=p(r*r)
        System.out.print("Введите радиус круга: ");
        r = input.nextDouble();
        System.out.printf("Площадь круга = %.2f", Math.pow(r, 2) * Math.PI);
    }

    public static void area_rectangle() {
        double a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Выбрана фигура: Прямоугольник"); // S=a*b
        System.out.print("Введите первую сторону: ");
        a = input.nextDouble();
        System.out.print("Введите вторую сторону: ");
        b = input.nextDouble();
        System.out.printf("Площадь прямоугольника = %.2f", a * b);
    }
}
