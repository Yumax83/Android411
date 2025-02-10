package lesson34.queue;

import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<String> states= new ArrayDeque<>();
        states.add("red");
        states.add("blue");
        states.add("white");
        states.add("green");
        states.add("black");

        System.out.println(states);

        System.out.println(states.getFirst());
        System.out.println(states.getLast());
        System.out.println();
        while (states.peek() !=null) { //удалили
            System.out.println(states.pop());
        }
    }
}
