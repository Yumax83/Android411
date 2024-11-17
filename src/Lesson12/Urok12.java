package Lesson12;

import java.util.ArrayList;
import java.util.Scanner;

public class Urok12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num1 = {3, 8, 9, 4, 1, 2, 5};
        int[] num2 = {1, 2, 5};
        System.out.println(max(num1));
        System.out.println(max(num2));
    }

    public static int max(int[] mas) {
        int mx = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mx < mas[i]) {
                mx=mas[i];
            }
        }
        return mx;
    }

}


