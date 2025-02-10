package lesson34.maps;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(334455,"Михаил Борисов");
        map1.put(778899,"Ринат Зуев");
        map1.put(443366,"Роман Свиридов");
        map1.put(225577,"Анна Полякова");
        map1.put(884466,"Анна Полякова");
        map1.putIfAbsent(334499,"Ирина Мельник");
        map1.put(null,"Виктор Водник");
        map1.put(112211,null);
        System.out.println(map1);
        System.out.println(map1.get(778899));
        System.out.println(map1.get(770099));
        System.out.println(map1.remove(779999));
        System.out.println(map1.containsValue("Роман Сверидов"));
        System.out.println(map1.containsValue("Ринат Зуев"));
        System.out.println(map1.containsKey(443366));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
