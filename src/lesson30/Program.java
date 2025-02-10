package lesson30;
interface WordCounter{
    int countWords(String text);
}

public class Program {
    public static void main(String[] args) {
        String txt = "    Лямбда     выражение    ";
        System.out.println("Исходная строка: " + txt);

        WordCounter wordCounter = (s) -> s.trim().split("\\s+").length; //trim убирает пробелы split ищет пробелы s+ ьолье одного
        int ctr = wordCounter.countWords(txt);
        System.out.println(ctr);

        txt = "Программа, которая подсчитывает количество слов в предложении!";
        System.out.println("Исходная строка: " + txt);
        ctr = wordCounter.countWords(txt);
        System.out.println(ctr);
    }
}