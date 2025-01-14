package lesson28.DZ28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов числового массива: ");
        int achi = input.nextInt();
        input.nextLine();
        Integer[] mass1 = new Integer[achi];
        System.out.println("Вводите элементы массива: ");
        for (int i = 0; i < mass1.length; i++) {
            System.out.print("-> ");
            mass1[i] = input.nextInt();
        }
        System.out.print("Введите количество элементов массива строк: ");
        int astr = input.nextInt();
        input.nextLine();
        String[] mass2 = new String[astr];
        System.out.println("Вводите элементы строкового массива: ");
        for (int j = 0; j < mass2.length; j++) {
            System.out.print("-> ");
            mass2[j] = input.nextLine();
        }
        PrintArray.printArray(mass1);
        PrintArray.printArray(mass2);
    }
}

