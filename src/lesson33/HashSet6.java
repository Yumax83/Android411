package lesson33;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet6 {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        a.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        b.addAll(Arrays.asList(5, 6, 7, 8, 9));

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        HashSet<Integer> union = new HashSet<>(a);
        System.out.println("union start= " + union);

        union.addAll(b); // объединение двух стеков без дубликатов
        System.out.println("union finish= " + union);

        HashSet<Integer> intersect = new HashSet<>(a);

        System.out.println("intersect start = " + intersect);
        intersect.retainAll(b); // пересечение сетов , общие элементы
        System.out.println("intersect finish = " + intersect);

        HashSet<Integer> subtract = new HashSet<>(a);

        System.out.println("subtract start = " + subtract);
        subtract.removeAll(b); // вычитание сетов  (из первого второй, те которые есть в первом но нет во втором)
        System.out.println("subtract finish = " + subtract);


    }
}
