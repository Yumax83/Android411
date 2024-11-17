package Lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Urok10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = 5;
//        char[][] graph = new char[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                graph[i][j] = '*';
//            }
//        }
//        for (int i = 0; i < graph.length; i++) {
//            for (int j = 0; j < graph.length; j++) {
//                System.out.print(graph[i][j] + "\t");
//            }
//            System.out.println();

//
//        int a = 3;
//        int b = 3;
//        int first = 0;
//        int second = 0;
//        int third = 0;
//        int[][] array = new int[a][b];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                int random = ((int) (Math.random() * 101));
//                array[i][j] = random;
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == 0) {
//                    first += array[i][j];
//                } else if (i == 1) {
//                    second += array[i][j];
//                } else {
//                    third += array[i][j];
//                }
//            }
//        }
//        System.out.println("Сумма элементов первой строки: " + first);
//        System.out.println("Сумма элементов второй строки: " + second);
//        System.out.println("Сумма элементов третьей строки: " + third);
//        int[][] mas = new int[3][5];
//        int pos = 0;
//        int sum = 0;
//        int minsum = Integer.MAX_VALUE;
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = (int) (Math.random() * 100);
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                sum += mas[i][j];
//            }
//            if (minsum > sum) {
//                minsum = sum;
//                pos = i;
//            }
//            System.out.println("Сумма элементов " + (i + 1) + " строки: " + sum);
//            sum = 0;
//        }
//        System.out.println("Строка с минимальной суммой элементов " + minsum + " имеет номер :" + (pos+1));
//        int[][] mas = new int[3][];
//        mas[0] = new int[2];
//        mas[1] = new int[3];
//        mas[2] = new int[4];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print("->");
//                mas[i][j] = input.nextInt();
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }
        // int[][] mas = new int[3][];
//        mas[0] = new int[]{1, 2};
//        mas[1] = new int[]{3, 4, 5};
//        mas[2] = new int[]{6, 7, 8, 9};

//        int[][] mas = new int[][]{{0}, {1, 2}, {3, 4, 5}, {6, 7, 8, 9}, {10, 11, 12, 13, 14, 15}};
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        int[][] mas = new int[5][];
//        mas[0] = new int[1];
//        mas[1] = new int[2];
//        mas[2] = new int[3];
//        mas[3] = new int[4];
//        mas[4] = new int[5];
//        int count = 0;
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = count++;
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        int[][] mas = new int[5][];
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = new int[mas.length - i];
//        }
//        int cont = 10;
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = cont++;
//            }
//        }
//            for (int i = 0; i < mas.length; i++) {
//                for (int j = 0; j < mas[i].length; j++) {
//                    System.out.print(mas[i][j] + "\t");
//                }System.out.println();
//        }
//        int n = 5;
//        int[][] tp = new int[n][];
//        for (int i = 0; i < tp.length; i++) {
//            tp[i] = new int[i + 1];
//            tp[i][0] = 1;
//            tp[i][i] = 1;
//            for (int j = 1; j < i; j++) {
//                tp[i][j] = tp[i - 1][j - 1] + tp[i - 1][j];
//            }
//        }
//        for (int i = 0; i < tp.length; i++) {
//            for (int j = 0; j < tp.length-i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < tp[i].length; j++) {
//                System.out.print(tp[i][j] + "   ");
//            }
//            System.out.println();
//        }

    }
}