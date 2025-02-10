package lesson27.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class simple5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(numbers);

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Orange"));
        System.out.println(colors);

        System.out.println(reverseList(numbers));
        System.out.println(reverseList(colors));
    }

    public static <T> ArrayList<T> reverseList(ArrayList<T> originalList) {
        ArrayList<T> newArray = new ArrayList<>();
        for (int i = originalList.size() - 1; i >= 0; i--) {
            newArray.add(originalList.get(i));
        }
        return newArray;
    }
}
