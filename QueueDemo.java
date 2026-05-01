import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // 🔸 Insertion
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Queue: " + queue);

        // 🔸 Peek
        System.out.println("Front Element: " + queue.peek());

        // 🔸 Removal
        queue.poll();
        System.out.println("After Removal: " + queue);

        // 🔸 Check empty
        System.out.println("Is Empty? " + queue.isEmpty());

        // 🔸 Loop
        System.out.println("Using Loop:");
        for(String item : queue) {
            System.out.println(item);
        }
    }
}