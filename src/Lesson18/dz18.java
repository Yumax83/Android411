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
            /* Сложно для понимания, первый раз столкнулся с такими шаблонами. Шаблон построил, задача решена, отрабатывает правильно.
            Но с учетом отсутствия опыта применения, не могу убедиться, что все идеально верно. Возможно на данный момент этого не требуется.
                Формирую шаблон так:
               [a-zа-яё0-9_]+     буквы анг и рус, цифры, нижнее подчеркивание это обяз 1 вхождение или мнгого раз.
               ([\\.-]*[a-zа-яё0-9_]+)*  точка или тире могут быть или не быть, но после них обязательно буквы или цифры и все это вместе может быть или не быть
               @[a-z]+   указание на символ почты @ после чего обяз 1 вхождение анг буквы.
               ([\\.]+[a-z]+)* после букв должна быть хотя бы одна точка, после чего обяз 1 вхождение буквы, и все это может быть или не быть, и если быть, то быть более одного вхождения
            */
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
