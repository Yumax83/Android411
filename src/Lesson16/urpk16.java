package Lesson16;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class urpk16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String text = " Текст с повторяющимися символами ";
//        text = text.trim().replace(" ", "");
//        StringBuilder sb = new StringBuilder(text);
//        for (int i = 1; i < sb.length(); i++) {
//            String ch = String.valueOf(sb.charAt(i - 1));
//            while (sb.indexOf(ch, i) != -1) {
//                System.out.println((sb.indexOf(ch)));
//                sb.deleteCharAt(sb.indexOf(ch, i));
//            }
//        }
//        System.out.println(sb);
//
//        for (int i = 0; i < sb.length(); i++) {
//            System.out.println(pos = sb.substring(i));
//            for (int j = sb.length(); j < sb.length()-j; j++) {
//                if (pos == sb.substring(j)+1) {
//                   System.out.println(pos);
//                }
//               //System.out.println(sb.substring(i));
//            }
//        }
//
//            stBuild.replace(pos, pos + 1, newStr);
//
//
//        StringBuilder  sb = new StringBuilder();
//        System.out.println(sb.capacity());
//        System.out.println(sb.length());
//        System.out.println(sb+"\n");
//
//        StringBuilder  sb1 = new StringBuilder(1000);
//        System.out.println(sb1.capacity());
//        System.out.println(sb1.length());
//        System.out.println(sb1+"\n");
//
//        StringBuilder  sb2 = new StringBuilder("Java");
//        System.out.println(sb2.capacity());
//        System.out.println(sb2.length());
//        System.out.println(sb2+"\n");
//        StringBuilder sb = new StringBuilder(); //можно перезаписывать
//        sb.append('a');
//        sb.append(true);
//        sb.append(10);
//        sb.append(12345L);
//        sb.append(10.20);
//        sb.append("Hello")
//                .append(" World");
//        sb.insert(5,"!");
//        sb.insert(sb.length(),"!!");
//        sb.insert(sb.length()-1,"&");
//        sb.delete(5, 6);
//        sb.deleteCharAt(13);
//        sb.deleteCharAt(12);
//        sb.deleteCharAt(11);
//
//        System.out.println(sb);
//        //sb.reverse();
//        //System.out.println(sb);
//
//        System.out.println(sb.indexOf("l",4));
//
//        StringBuilder sb1 = createStr(5, 3);
//        System.out.println(sb1);
//        //modifyStr(sb1);
//        modifyStr(sb1, "=", "равно");
//        modifyStr(sb1, "+", "плюс");
//        modifyStr(sb1, "-", "минус");
//        modifyStr(sb1, "*", "умножить");
//
//        System.out.println(sb1);
//        sb.replace(6,11, "Java");
//        System.out.println(sb);
//
//        String st = sb.substring(6,7);
//        System.out.println(st);
//        st = sb.substring(6);
//
//    System.out.println(sb);
//
//
//    public static StringBuilder createStr(int a, int b) {
//        StringBuilder res = new StringBuilder();
//        res.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
//        res.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
//        res.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
//        return res;
//    }
//
//        public static StringBuilder modifyStr(StringBuilder stBuild){
//        int pos = stBuild.indexOf("=");
//        stBuild.deleteCharAt(pos);
//        stBuild.insert(pos,"равно");
//        return  stBuild;
//    }
//    public static StringBuilder modifyStr(StringBuilder stBuild) {
//        int pos;
//        while ((pos = stBuild.indexOf("=")) != -1) { //-1 зарезерв значение есди не найден элемент
//            stBuild.deleteCharAt(pos);
//            stBuild.insert(pos, "равно");
//        }
//        return stBuild;
//    }
//    public static StringBuilder modifyStr(StringBuilder stBuild, String oldStr, String newStr) {
//        int pos;
//        while ((pos = stBuild.indexOf(oldStr)) != -1) { //-1 зарезерв значение есди не найден элемент
//            stBuild.replace(pos, pos + 1, newStr);
//        }
//        return stBuild;
        String s = "Я ищу [dfdf] совпадения в 2024 году. И я их tyt найду в 2 счёта. 59100000 Ели 20000";

        //String pattern = "[12][0-9][0-9][0-9]";
      //String pattern = "[А-яЁ-ё\\[\\]-]"; // [А-яЁё]
        //String pattern = "[A-Za-z]";
       // String pattern = "[^0-9]"; //ищем все кроме цифр
       // String pattern = "\\.";
        //String pattern = "\\d"; //[0-9] цифы
        //String pattern = "\\s"; // [0-9] пробел S не пробел
      //  String pattern = "\\w"; // [0-9] англ буква
       //String pattern = "\\D"; // [0-9] не цифра
      // String pattern = "\\AЯ ищу";
      // String pattern = "Ели\\Z";
      //String pattern = "\\Bпадения";
        String pattern = "20*";
        //String pattern = "\\w+";
        /* кол  повторений
        + от 1 до бескон
        * от 0 до беск
        ? - от 0 до 1
         */




        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        //System.out.println(matcher.find());
        while (matcher.find()) {
            //System.out.println("Шаблон совпадения найден с " + matcher.start() + " по " + (matcher.end() - 1));
            //  System.out.println(s.substring(matcher.start(), matcher.end()));
            System.out.print(matcher.group()+" ");
        }
    }
}



