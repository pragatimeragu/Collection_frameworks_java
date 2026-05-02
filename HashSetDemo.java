//HashSet is a class in the Java Collections Framework that stores unique elements only.
//👉 It is based on HashMap internally
//👉 Does not allow duplicates

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        // 🔸 Insertion
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple"); // duplicate ignored

        System.out.println("Set: " + set);

        // 🔸 Remove
        set.remove("Banana");
        System.out.println("After Deletion: " + set);

        // 🔸 Check element
        System.out.println("Contains Mango? " + set.contains("Mango"));

        // 🔸 Size
        System.out.println("Size: " + set.size());

        // 🔸 Loop
        for(String item : set) {
            System.out.println(item);
        }

        // 🔸 Clear
        set.clear();
        System.out.println("After Clearing: " + set);
    }
}