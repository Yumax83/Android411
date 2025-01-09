package lesson21.rand;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int cnt = 30;
        int min = 5;
        int max = 10;
        for (int i = 0; i < cnt; i++) {
            // System.out.println(rand.nextBoolean());
            //  System.out.println(rand.nextInt());
            //  System.out.println(rand.nextInt(max)); // от 0 до max
          //  System.out.println(rand.nextInt(max - min+1) + min); // от min до max
            System.out.println(rand.nextInt(min,max+1)); // от min до max

        }
    }
}
