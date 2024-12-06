package Lesson16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class urok17 {
    public static void main(String[] args) {
        // String s = "Час в 24-часовом формате от 00 до 23ю 2021-06-15Т21:45. " +
        //  "Минуты в диапозоне от 00 до 59. 2021-0615Т01:09";
       // String s = "Цифры: 7, +17, -42, 0013, 0.3";
        //String pattern = "[+-]?[\\d.]+";
        //String pattern = "[+-]?\\d+\\.?\\d*";
       // String pattern = "[+-]?\\d+\\.?\\d+";

        // String pattern = "[0-2][0-9]:[0-5][0-9]";
        String s = "author=Пушкин А.С.; title = Евгений Онегин; price =200; year= 1831";
        //String pattern = "\\w+\\s*=\\s*[А-я0-9 .]+";
        String pattern = "\\w+\\s*=\\s*[^;]+";

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group() + " ");
        }
    }
}
