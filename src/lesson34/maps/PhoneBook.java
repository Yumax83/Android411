package lesson34.maps;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Зотов", 778899, bookPhone);
        addNumber("Зотов", 112233, bookPhone);
        addNumber("Калинкин", 749988, bookPhone);
        addNumber("Романов", 889922, bookPhone);
        addNumber("Зотов", 445577, bookPhone);
        addNumber("Калинкин", 116655, bookPhone);
        printBook(bookPhone);
    }

    public static void addNumber(String key, int value, HashMap<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(HashMap<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            int i = 0;
            for (int el : item.getValue()) {
                //  phones = phones + el + ", ";
                phones = phones + el + (item.getValue().size() - 1 == i ? " " : ", ");
                i++;
            }
            System.out.printf("%s: %s%n", item.getKey(), phones);
        }
    }
}
