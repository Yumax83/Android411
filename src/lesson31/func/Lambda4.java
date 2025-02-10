package lesson31.func;

import java.util.Scanner;
import java.util.function.Supplier;

public class Lambda4 {
    public static void main(String[] args) {
//        String t = "One";
//        Supplier<String> supplier = () -> t.toUpperCase();
//        System.out.println(supplier.get());
        Supplier<User> userFactory = () -> {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите имя: ");
            String name = input.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();
        System.out.println("Тия пользователя 1: "+user1.getName());
        System.out.println("Тия пользователя 1: "+user1.getName());
    }
}

class User {
    private String name;


    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

