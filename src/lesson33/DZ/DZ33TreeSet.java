package lesson33.DZ;

import java.util.Scanner;
import java.util.TreeSet;


public class DZ33TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> dzTreeSet = new TreeSet<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Введите пять целых чисел с клавиатуры: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("->");
            int num = input.nextInt();
            dzTreeSet.add(num);
        }
        System.out.println("TreeSet сет наполнен следующими числами: " + dzTreeSet);
        System.out.println("\nНаименьший элемент в TreeSet сете: " + dzTreeSet.first());
        // System.out.println(dzTreeSet.stream().findFirst());


    }
}
