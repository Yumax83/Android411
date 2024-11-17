package Lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class DZ9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] num = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println("  < --- Исходный массив --->");
        for (int i = 0; i < num.length; i++) {
            System.out.println("\t\t" + Arrays.toString(num[i]));
        }
        System.out.println("\n< -- Преобразованные элементы массива в квадрате -- > ");
        for (int i = 0; i < num.length; i++) {
            System.out.print("\t\t\t\t");
            for (int j = 0; j < num[i].length; j++) {
                num[i][j]*=num[i][j];
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
