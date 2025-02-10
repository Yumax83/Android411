package lesson34.DZ35;

import java.util.*;

public class MapDZ35 {
    public static void main(String[] args) {
        Map<Key, Integer> map1 = new LinkedHashMap<>();
        map1.put(new Key("X"), 1);
        map1.put(new Key("Y"), 2);
        map1.put(new Key("Z"), 3);
        System.out.println("Исходный Map: " + map1);

        ArrayList<Integer> newKey = new ArrayList<>();
        newKey.addAll(map1.values());

        ArrayList<Key> newValue = new ArrayList<>();
        newValue.addAll(map1.keySet());

        Map<Integer, Key> map2 = new LinkedHashMap<>();
        for (int i = 0; i < newValue.size(); i++) {
            for (int j = 0; j < newKey.size(); j++) {
                map2.put(newKey.get(j), newValue.get(j));
            }
        }
        System.out.println("Измененный Map: " + map2);
    }
}

class Key {
    String key;

    public Key(String key) {
        this.key = key;
    }
    @Override
    public String toString() {
        return key;
    }
}
