package lesson34.maps;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<String, String> fileExtension = new TreeMap<>((o1, o2) -> o1.compareTo(o2));
       // TreeMap<String, String> fileExtension = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        fileExtension.put("Python", "*.py");
        fileExtension.put("C++", "*.cpp");
        fileExtension.put("JavaScript", "*.js");
        fileExtension.put("Golang", "*.jo");
        fileExtension.put("Java", "*.java");
        fileExtension.put("java", "*.java");
        System.out.println(fileExtension);
//        System.out.println(fileExtension.get("Java"));
//        fileExtension.remove("Golang");
//        System.out.println(fileExtension);
     //  System.out.println(fileExtension.descendingMap());
//        System.out.println(fileExtension);
//        System.out.println(fileExtension.lastEntry());
//        System.out.println(fileExtension.firstEntry());

    }
}
