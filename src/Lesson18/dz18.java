package Lesson18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class dz18 {
    public static void main(String[] args) {
        String s = "123456@i.ru,  123_456@ru.name.ru,  login@i.ru,  логин-1@i.ru,  login.3@i.ru,  login.3-67@i.ru,  1login@ru.name.ru";
        try {

            System.out.println(s);
            String pattern = "[a-zа-яё0-9_]+([\\.-]*[a-zа-яё0-9_]+)*@[a-z]+([\\.]+[a-z]+)*";
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
