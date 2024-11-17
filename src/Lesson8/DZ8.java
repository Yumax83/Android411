package Lesson8;

import java.util.Scanner;
import java.util.Arrays;

public class DZ8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Задача: Запросить пользователя задать лиапазоны массива,
        // заполнить и записать (сохранить) массив в диапазоне заданным пользователем (включая нижнюю и верхнюю указанную границу)
        int[] array;
        int verh = 0, niz = 0;
        System.out.print("Введите нижнее значение диапазона: ");
        niz = input.nextInt();
        System.out.print("Введите верхнее значение диапазона: ");
        verh = input.nextInt();
        if (verh > niz) {
            System.out.print("Значения в диапазоне от " + niz + " до " + verh + ":  ");
            array = new int[(verh - niz) + 1];
            for (int i = 0; i < array.length; i++) {
                array[i] = niz;
                niz++;
                System.out.print(array[i] + " ");  // вывод на экран записываемых элементов в массив непосредственно в цикле через индекс
            }
            System.out.println("\n");
            for (int element : array) {    // вариант вывод на экран после записывания элементов в массив через forech через обращение к элементу
                System.out.print(element + " ");
            }
            System.out.println("\n");
            System.out.println(Arrays.toString(array)); // вариант вывода на экран элементов массива через функцию преобразования
        } else System.out.println("Введено неверное значение верхнего диапазона. Попробуйте снова.");
    }
}
