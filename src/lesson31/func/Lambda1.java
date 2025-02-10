package lesson31.func;

import java.util.function.Predicate;

public class Lambda1 {
    public static void main(String[] args) {
//        Predicate<Integer> isPositive =  x -> x > 0;
//        System.out.println(isPositive.test(5));
//        System.out.println(isPositive.test(-7));

        Predicate<String> isPalindrome = str -> {
           // str = str.toLowerCase();
          //  String reversed = new StringBuilder(str).reverse().toString();
            String reversed = new StringBuilder(str).reverse().toString().toLowerCase();
           // return str.equals(reversed);
            return str.toLowerCase().equals(reversed);

        };
        String word1 = "Мадам";
        boolean res = isPalindrome.test(word1);
        System.out.println(word1 + " это полиндром: " + res);

        String word2 = "радар";
        boolean res2 = isPalindrome.test(word2);
        System.out.println(word2 + " это полиндром: " + res2);

        System.out.println(3 % 2);
    }
}
