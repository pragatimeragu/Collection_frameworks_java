import java.util.*;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // 🔸 Push (Insertion)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // 🔸 Peek
        System.out.println("Top Element: " + stack.peek());

        // 🔸 Pop (Deletion)
        stack.pop();
        System.out.println("After Pop: " + stack);

        // 🔸 Search
        System.out.println("Position of 10: " + stack.search(10));

        // 🔸 Check empty
        System.out.println("Is Empty? " + stack.empty());

        // 🔸 Loop
        System.out.println("Using Loop:");
        for(int i : stack) {
            System.out.println(i);
        }
    }
}