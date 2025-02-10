package lesson34.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue2 {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(String::length));

        priorityQueue.add("Александр");
        priorityQueue.add("Игорь");
        priorityQueue.add("Андрей");

        System.out.println(priorityQueue);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }
    }
}
