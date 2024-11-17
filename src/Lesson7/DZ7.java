package Lesson7;

import java.util.Scanner;

public class DZ7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            for (int j = 1; j < 7 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 7 - 2 * i; j <= 7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
