package Lesson14;

import java.util.Arrays;

public class DZ14 {
    public static void main(String[] args) {
        String s = "\"Hello, World\"";
        System.out.println("Дана строка - " + s);
        int[] result = new int['z' - 'A' + 1];
        int a = 0, b = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result[ch - 'a']++;
                a++;
            }
            if (ch >= 'A' && ch <= 'Z') {
                result[ch - 'A']++;
                b++;
            }
        }
        System.out.println("Количество строчных букв - " + a + ", " + "количество прописных букв - "+b);


    }
}
