package Lesson10;

import java.util.Scanner;

public class DZ10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Вычисление площади фигур. Выберите фигуру: ");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Прямоугольник");
        System.out.println("3 - Круг");
        System.out.print("->");
        int n = input.nextInt();
        double a, b, c, p;
        switch (n) {
            case 1:
                System.out.println("Выбрана фигура: Треугольник"); //S = √(p(p - a)(p - b)(p - c)), p = (a + b + c)/2
                System.out.print("Введите первую сторону: ");
                a = input.nextDouble();
                System.out.print("Введите вторую сторону: ");
                b = input.nextDouble();
                System.out.print("Введите третью сторону: ");
                c = input.nextDouble();
                p = (a + b + c) / 2;
                System.out.printf("Площадь треугольника = %.2f", Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            case 2:
                System.out.println("Выбрана фигура: Прямоугольник"); // S=a*b
                System.out.print("Введите первую сторону: ");
                a = input.nextDouble();
                System.out.print("Введите вторую сторону: ");
                b = input.nextDouble();
                System.out.printf("Площадь прямоугольника = %.2f", a*b);
                break;
            case 3:
                System.out.println("Выбрана фигура: Круг"); // S=p(r*r)
                System.out.print("Введите радиус круга: ");
                a = input.nextDouble();
                System.out.printf("Площадь круга = %.2f", Math.pow(a,2)*Math.PI);
                break;
            default:
                System.out.println("Ошибка выбора фигуры. Попробуйте снова.");
        }
    }
}
