package Lesson15;

import java.util.Arrays;
import java.util.Scanner;

public class urok15 {
    public static void main(String[] args) {

//        String s1="";
//        if (s1.isEmpty()){
//            System.out.println("Строка пустая");
//        }
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку для проверки на палиндром: ");
        try {
            String str = input.nextLine().toLowerCase().replaceAll("(?U)\\W", "");
            if (str.isEmpty()) {
                throw new Exception("Строка пустая. Попробуйте снова.");
            }
            char[] res = str.toCharArray();
            for (int i = 0; i < res.length; i++) {
                res[i] = str.charAt(str.length() - 1 - i);
            }
            String str2 = new String(res);
            if (str.equals(str2)) {
                System.out.println("Строка является палиндромом");
            } else {
                System.out.println("Строка не является палиндромом");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


//        String path = "https://www.oracle.com/java/technologies/downloads/#jdk20-";
//        char[] chars = path.toCharArray();
//
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == '/') {
//                chars[i] = '\\';
//            }
//        }
//        String res = new String(chars);
//        System.out.println(res);
//        String str1 = "I learning Java"; //поиск букв по индексам
//
//        System.out.println(str1);
//        System.out.println(str1.indexOf('a'));
//        System.out.println(str1.lastIndexOf('a'));
//        System.out.println(str1.indexOf('a',5));
//        System.out.println(str1.lastIndexOf('a',5));
//        System.out.println("    Hello World  ".trim()); //Трим убирает пробелы сначала и с конца строки
//        String str = "I learning Java";
//        String str1 = str.substring(2,10);
//        System.out.println(str1);
//        System.out.println("I learning Java".substring(2));

//        System.out.print("Введите два слова через пробел: ");
//        String str = input.nextLine();
//        String first = str.substring(0, str.indexOf(" "));
//        System.out.println(first);
//        String second = str.substring(str.indexOf(" ")).trim();
//        System.out.println(second);
//        System.out.println(second + " " + first);

        // другой способ замены строки

//        String str1 = "I learning Java";
//        String[] words = str1.split(" ");
//        for (String word:words)
//            System.out.println(word);

//        System.out.print("Введите ФИО: ");
//        String str = input.nextLine();
//        String[] fio = str.split(" ");
//        System.out.println(Arrays.toString(fio));
//        System.out.println(fio[0] + " " + fio[1].substring(0, 1) + "." + fio[2].substring(0, 1)+".");
//        System.out.println(fio[0] + " " + fio[1].charAt(0) + "." + fio[2].charAt(0)+".");

//        String str = "Строка...";
//        char[] res = new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//             res[i] = str.charAt(str.length() - 1 - i);
//        }
//        System.out.println(res);
//        String line = "Строка";
//        String result = "";
//        for (int i = line.length() - 1; i >= 0; i--) {
//            result += line.charAt(i);
//        }
//        System.out.println(result);
//        String line = "Строка";
//        String result = "";
//        for (int i = 0; i < line.length(); i++) {
//            result = line.charAt(i)+result;
//        }
//        System.out.println(result);
//        String res = String.join(":", "00", "23", "30");
//        System.out.println(res);
//
//        String[] text = new String[]{"Я", "буду", "хорошим", "программистом"};
//        String str5 = String.join(" && ", text);
//        System.out.println(str5);
//        String text = "Я изучаю Java. Мне нравится Java.";
//        System.out.println(text);
//        String[] array = text.split("Java");
//        System.out.println(Arrays.toString(array));
//        String res2 = String.join("Android", array);
//        System.out.println(res2);

//        String text = "\"Замените в этой строке все появления буквы 'о' на букву 'О', кроме первого и последнего вхождения\"";
//        text = text.replace("о", "О");
//        System.out.println(text);
//        String text2 = "";
//        char x;
//        int pos1 = text.indexOf('о');
//        int pos2 = text.lastIndexOf('о');
//        for (int i = 0; i < text.length(); i++) {
//            x = text.charAt(i);
//            if (x == 'о' && i != pos1 && i != pos2) {
//                x = 'О';
//            }
//            text2 += x;
//        }
//        String line = "Замените в этой строке все появления буквы 'о' на букву 'О', кроме первого и последнего вхождения";
//        String a = line.substring(0, line.indexOf("о") + 1);
//        String b = line.substring(line.indexOf("о") + 1, line.lastIndexOf("о"));
//        String c = line.substring(line.lastIndexOf("о"));
//        System.out.println(a + b.replace("о", "О") + c);

//        String a = "Hello";
//        String b = "Hello";
//        String c = "Good-bye";
//        String d= "HELLO";
////        if (a==b) {
////            System.out.println("Значения переменных равны");
////        } // спец функция сравнения
//        System.out.println(a + " == " + b + " -> "+ a.equals(b));
//        System.out.println(a + " == " + d + " -> "+ a.equals(d));
//        System.out.println(a + " == " + c + " -> "+ a.equals(c));
//        System.out.println(a + " == " + d + " -> "+ a.equalsIgnoreCase(d));

//        System.out.println("I learning Java".endsWith("Java"));
//        System.out.println("I learning Java".startsWith("I"));
//        System.out.println("I learning Java".contains("ing"));
//
//        System.out.println("Введите название документа: ");
//        String path = input.nextLine();
//        if (path.endsWith(".jpg") || path.endsWith(".jpeg") || path.endsWith(".png"))
//            System.out.println("Это изображение");
//        else if (path.endsWith(".html"))
//            System.out.println("Это html-страница");
//        else if (path.endsWith(".doc") || path.endsWith(".docx"))
//            System.out.println("Это документ Word");
//        else System.out.println("Неизвестный формат");

//        //String s = "I learning Java";
//        String s = "АЯаяЁё";
//        int n;
//        n = s.codePointAt(4);
//        System.out.println(n);
//        n = s.codePointAt(0);
//        System.out.println(n);
//        n = s.codePointAt(1);
//        System.out.println(n);
//        n = s.codePointAt(2);
//        System.out.println(n);
//        n = s.codePointAt(3);
//        System.out.println(n);
//        n = s.codePointAt(5);
//        System.out.println(n);

//        String s = "I learning Java";
//       int n;
//        n = s.codePointAt(0);
//        System.out.println(n);
//        n = s.codePointAt(4);
//        System.out.println(n);
//        n = s.codePointBefore(3);
//        System.out.println(n);
//        n = s.codePointCount(3,5);
//        System.out.println(n);

//        String s;
//        // double d = 3.8596;
//        // int d = -8596;
//        //char d = '+';
//        s = String.valueOf(d);
//        System.out.println(s);

//        String str = "1";
//        System.out.println("1 > 5 : " + str.compareTo("5"));
//        System.out.println("1 == 1 : " + str.compareTo("1"));
//        str="7";
//        System.out.println("7 > 5 : " + str.compareTo("5"));

//        String str = "a";
//        System.out.println("a > d : " + str.compareTo("d"));
//        System.out.println("a == a : " + str.compareTo("a"));
//        str="t";
//        System.out.println("7 > t : " + str.compareTo("d"));
//
//        String str1 = "прИвет"; //1055 П  //1087 п =-32
//        System.out.println("Привет>привет : " + str1.compareTo("привет"));
//        System.out.println("Привет>привет : " + str1.compareToIgnoreCase("привет"));

//        String str = "11 23 44 55 23 22";
//        String str1 = "23";
//        String change = "!!!";
//        if (str.contains(str1)) {
//            str = str.replace(str1, change);
//            System.out.println(str);
//        } else System.out.println("Нет элементов для замены");
//        String str = "GG junntt, i' n";
//
//        String str2 = new StringBuilder(str.replaceAll("\\W", ""))
//                .reverse().toString();
//        System.out.println(str2);
//        String s = " z  --abc  67876 ..cba Z";
//        s = s.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
//        if (s.toLowerCase().equals((new StringBuilder(s)).reverse().toString().toLowerCase()))
//            System.out.println("Палиндром! " + s);
//        else
//            System.out.println("Не палиндром! :( " + s);

    }
}

