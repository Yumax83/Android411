package lesson34.queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> task = new PriorityQueue<>();
        task.add(5);
        task.add(1);
        task.add(9);
        task.add(2);
        task.add(3);
        task.add(3);
        System.out.println(task);

        while (!task.isEmpty()) {
           // System.out.println(task.remove());
            System.out.println(task.poll()); //то же самое как remove
        }
        System.out.println(task.peek()); // возвращает элемент по самому высокому приоритету
       // System.out.println(task.element()); // как peak
        System.out.println(task);

    }
}
