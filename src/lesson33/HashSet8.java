package lesson33;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// ЗАДАЧА ИЗБАВИТЬСЯ ОТ ДУБЛИКАТОВ
public class HashSet8 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 7, 8, 8, 10};
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        Set<Integer> set = new HashSet<>(); // ХешСет не добавляет повторов
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println("Результат в хешсете: " + set);

        int[] uniqueArr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            uniqueArr[i++] = num;
        }
        System.out.println("Массив без дубликатов: " + Arrays.toString(uniqueArr));
    }
}
