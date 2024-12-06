package Lesson16;

public class DZ17 {
    public static void main(String[] args) {
        String text = " Текст с повторяющимися символами ";
        text = text.trim().replace(" ", "");
        StringBuilder sb = new StringBuilder(text);
        for (int i = 1; i < sb.length(); i++) {
            String ch = String.valueOf(sb.charAt(i - 1));
            while (sb.indexOf(ch, i) != -1) {
               sb.deleteCharAt(sb.indexOf(ch, i));
            }
        }
        System.out.println(sb);
    }
}