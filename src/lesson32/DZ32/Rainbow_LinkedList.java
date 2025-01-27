package lesson32.DZ32;

import java.util.LinkedList;
import java.util.ListIterator;

public class Rainbow_LinkedList {
    public static void main(String[] args) {

        Rainbow rb1 = new Rainbow("Красный");
        Rainbow rb2 = new Rainbow("Оранжевый");
        Rainbow rb3 = new Rainbow("Желтый");
        Rainbow rb4 = new Rainbow("Зеленый");
        Rainbow rb5 = new Rainbow("Голубой");
        Rainbow rb6 = new Rainbow("Синий");
        Rainbow rb7 = new Rainbow("Фиолетовый");

        LinkedList<Rainbow> rbs = new LinkedList<>();
        rbs.add(rb1);
        rbs.add(rb2);
        rbs.add(rb3);
        rbs.add(rb4);
        rbs.add(rb5);
        rbs.add(rb6);
        rbs.add(rb7);
        System.out.println("LinkedList = " + rbs);

        ListIterator<Rainbow> listIterator =rbs.listIterator();
        System.out.println("\nИтерация в прямом направлении:");
        while (listIterator.hasNext()) {
            System.out.println("Индекс = " + listIterator.nextIndex() + ", элемент = " + listIterator.next());
        }
        System.out.println("\nИтерация в обратном направлении:");
        while (listIterator.hasPrevious()) {
            System.out.println("Индекс = " + listIterator.previousIndex() + ", элемент = " + listIterator.previous());
        }
    }
}

class Rainbow {
    private String name_RainbowColor;

    public Rainbow(String name_RainbowColor) {
        this.name_RainbowColor = name_RainbowColor;
    }

    @Override
    public String toString() {
        return name_RainbowColor;
    }
}
