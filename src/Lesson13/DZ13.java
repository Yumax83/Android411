package Lesson13;

import java.util.Arrays;

public class DZ13 {
    public static void main(String[] args) {
        int[] mas = {-2, 3, 8, -11, -4, 6,5,-7,-1,0};
        System.out.println("Исходный массив = " + Arrays.toString(mas));
        System.out.println("Количество отрицательных элементов в массиве = " + AccNegative(0, 0, mas)); //передаем значения в метод

        System.out.println("Домашнее задание: отправить на проверку последнее домашнее задание ссылкой на HitHub");

    }

    public static int AccNegative(int i, int c, int[] arr) {
        if (i != (arr.length - 1)) { // создаем условие для рекурсии до конца длины массива
            if (arr[i] < 0) c++; // если элемент меньше нуля записываем в счетчик
            return AccNegative(i + 1, c, arr); // вызываем рекурсию с передачей параметров "i+1" и счетчик "с"
        }
        return c; // возвращаем значение счетчика
    }

}
