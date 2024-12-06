package Lesson18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class urok18 {
    public static void main(String[] args) {
        try {
            // String s = "Час в 24-часовом формате от 00 до 23ю 2021-06-15Т21:45. " +
            //      "Минуты в диапозоне от 00 до 59. 2021-0615Т01:09";
            //  String s = "12 сентября 2024 года 3452`343564";
           // String s = "+7 499 456-45-78, +74994564578, +7 (499) 456 45 78, 74994564578";

           // String pattern = "[+]?\\d{7,}";
            //String pattern = "\\+?7\\d{10}";
          //  String s = "I learning Java Hello";
            //String pattern = "^\\w+\\s\\w+"; //только от начала
           // String pattern = "\\w+\\s\\w+"; // любые
          //  String pattern = "\\w+\\s\\w+$"; // в конце

            // String pattern = "\\d{2,4}"
            // String pattern = "\\d{2,}";

            String s = "Java_master";
            String pattern = "^[\\w-]{3,16}$"; //  [A-Za-z0-9-] (от 3 до 16 символов)

            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(s);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException pse) {
            System.out.println("Не правильное регулярное выражение: " + pse.getMessage());
            System.out.println("Опимание: " + pse.getDescription());
            System.out.println("Позиция: " + pse.getIndex());
            System.out.println("Не правильный шаблон: " + pse.getPattern());

        }
    }
}