package lesson33;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSet7 {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>();
        num.add(43);
        num.add(31);
        num.add(24);
        num.add(54);
        num.add(21);
      //  num.add(null);
        num.add(0);
        num.add(-5);
        System.out.println(num);

        Integer max = null;
        for (Integer item : num) {
            if (max == null) {
                max = item;
            } else if (max < item) {
                max = item;

            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + Collections.min(num)); // без цикла
    }
}
