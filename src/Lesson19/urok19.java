package Lesson19;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class urok19 {
    public static void main(String[] args) {
        //String s = "Я ищу совпадения в 2024 году. И я их  найду в 2 счёта. Hel_lo World. 59100000 Ели 20000";
        //String s = "Суворова Виктория, Россия, г. Сочи,           +7 999 555 77 33";
        String s = "05-03-1987 // Дата рождения";
        String s2 = s.replaceAll("(\\s//.*)", "").replaceAll("-",".");
        //s2 = s2.replaceAll("-",".");
        System.out.println("Дата рождения: " + s2);
        //String s = "one\ntwo";
        //String s = "500$";
        //String s = "Java,\njava,\nJAVA";
        //String s="<body>Пример жадного взаимодействия регулярных выражений</body>";
//        try {
//            //String pattern = "(?mi)^java";
//            //String pattern = "<.*?>";
//            // String s = "Егорова Алиса Александровна";//
//            //String s = "Word2016, PS16, AI5";
//            //String s = "one";
//            //String pattern = "(.(.(.)))";
////            String s = "Ольга и Виталий отлично учатся";
////            String pattern = "Петр|Ольга|Виталий";
//            //String pattern = "А.+а";
//            // String pattern = "([a-z]+)(\\d*)";
//            //String pattern = "one.\\w+";
//            // String pattern = "one$";
//            // String pattern = "500$";
//            //String pattern = "я";
//
//            // String pattern = "\\d+ #поиск цифры";
//            //ФЛАГИ
//            //Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
//            // Pattern regex = Pattern.compile(pattern, Pattern.COMMENTS);
//// Pattern regex = Pattern.compile(pattern);
//            //Pattern regex = Pattern.compile(pattern, Pattern.DOTALL);
//            // Pattern regex = Pattern.compile(pattern, Pattern.MULTILINE);
//            //Pattern regex = Pattern.compile(pattern, Pattern.LITERAL);
//            // String s = "int = 4, float = 4.0f, double = 8.0";
//            //  String pattern = "(int|float)\\s*=\\s*(\\d[.\\w]*)";
//            // String s = "127.0.0.1";
//
////            String s = "192.168.255.255";
////            String pattern = "(\\d{1,3}\\.){3}\\d{1,3}";
////            Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
////            Matcher matcher = regex.matcher(s);

//            Scanner input = new Scanner(System.in);
//            System.out.print("Введите дату dd-mm-yyyy: ");
//            String s = input.nextLine();
//            String pattern = "(0[1-9]|[12][0-9]|3[01])-([0][1-9]|1[0-2])-(19[0-9][0-9]|20[0-9][0-9])";
//            Pattern regex = Pattern.compile(pattern);
//            Matcher matcher = regex.matcher(s);

        // matcher.find();
//            System.out.println(matcher.groupCount());
//            for (int i = 0; i <= matcher.groupCount(); i++) {
//                System.out.println(i + ": " + matcher.group(i));
//            }

//            while (matcher.find()) {
//                System.out.println(matcher.group());
////               System.out.println(matcher.group(1));
////                System.out.println(matcher.group(2));
//            }
//        } catch (PatternSyntaxException pse) {
//            System.out.println("Не правильное регулярное выражение: " + pse.getMessage());
//            System.out.println("Описание: " + pse.getDescription());
//            System.out.println("Позиция: " + pse.getIndex());
//            System.out.println("Не правильный шаблон: " + pse.getPattern());
//
//        }
//    }
//        String[] arr = s.split(",\\s*");
//        System.out.println(Arrays.toString(arr));
//        for (String temp:arr) {
//            System.out.println(temp);
//
//        }
    }
}


