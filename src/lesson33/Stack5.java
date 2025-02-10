package lesson33;

import java.util.Stack;

public class Stack5 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("Катя");
        System.out.println(stack);
        stack.push("Виктор");
        stack.push("Игорь");
        stack.push("Миша");
        stack.push("Ирина");
        System.out.println(stack);
        stack.remove(1);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
