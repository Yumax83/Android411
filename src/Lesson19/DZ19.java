package Lesson19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class DZ19 {
    public static void main(String[] args) {
        String s = "+7 499 456-45-78\n+74994564578\n7 (499) 456 45 78\n7 (499) 456-45-78";
        try {
            System.out.println(s + "\n");
            String pattern = "\\+?7\\s*\\(?[0-9]{3}\\)?\\s*[0-9]{3}\\s*\\-*[0-9]{2}\\s*\\-*[0-9]{2}";
            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(s);
            while (matcher.find()) {
                System.out.print(matcher.group() + "   ");
            }
        } catch (PatternSyntaxException pse) {
            System.out.println("Не правильное регулярное выражение: " + pse.getMessage());
            System.out.println("Описание: " + pse.getDescription());
            System.out.println("Позиция: " + pse.getIndex());
            System.out.println("Не правильный шаблон: " + pse.getPattern());
        }
    }
}

