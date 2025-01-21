package lesson29.DZ29;


import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите исходную строку: ");
        String str = input.nextLine();
        try {
            checking(str);
        } catch (CheckStringException e) {
            System.out.println("Перехваченное исключение. " + e);
        }
    }

    public static void checking(String str) throws CheckStringException {
        System.out.println("Вызван метод checking (исходная строка: " + str + ")");
        String strVowelsEnglish = "AaEeIiOoUuYy";
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < strVowelsEnglish.length(); j++) {
                if (str.charAt(i) == strVowelsEnglish.charAt(j)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) break;
        }

        if (flag == 0) {
            throw new CheckStringException(str, "Ошибка: Строка не содержит гласных букв");
        } else System.out.println("Строка содержит гласные буквы");
    }

}


