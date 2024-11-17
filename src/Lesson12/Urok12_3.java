package Lesson12;

import java.util.Scanner;

public class Urok12_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("На каком вы этаже: ");
        int n1 = input.nextInt();
        elevator(n1);
    }

    public static void elevator(int n) {
        if (n == 0) {
            System.out.println("Вы в подвале");
            return;
        }
        System.out.println("=> " + n);
        elevator(n - 1); // стек: 5 4 3 2 1
        System.out.print(n + " ");
    }
}
