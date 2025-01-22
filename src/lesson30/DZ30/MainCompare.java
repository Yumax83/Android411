package lesson30.DZ30;

interface CompareWordInterface {
    public void compareWords(String word1, String word2);
}

public class MainCompare {
    public static void main(String[] args) {
        String w1 = "Собака";
        String w2 = "Кот";
        String w3 = "Змея";
        String w4 = "Хомяк";
        System.out.println("Первое слово: " + w1);
        System.out.println("Второе слово: " + w2);

        CompareWordInterface res = new CompareWordInterface() {
            @Override
            public void compareWords(String word1, String word2) {
                System.out.println("\nБез лямбда выражения");
                String systemStr;
                if (word1.length() < word2.length()) systemStr = word1;
                else systemStr = word2;
                if (word1.length() == word2.length()) System.out.println("Слова одинаковой длины");
                else
                    System.out.println("Самое короткое слово: " + systemStr);
            }
        };
        CompareWordInterface res1 = (word1, word2) -> {
            System.out.println("\nС лямбда выражением");
            String systemStr;
            if (word1.length() < word2.length()) systemStr = word1;
            else systemStr = word2;
            if (word1.length() == word2.length()) System.out.println("Слова одинаковой длины");
            else
                System.out.println("Самое короткое слово: " + systemStr);
        };
        res.compareWords(w1, w2);
        res1.compareWords(w3, w4);


    }
}
