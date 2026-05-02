// HashMap is a class in the Java Collections Framework that stores data in key–value pairs.
// 👉 Each key maps to a value
// 👉 Keys must be unique, but values can be duplicate
// 👉 Unordered (no fixed order)

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        // Creating HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 🔸 Insertion
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println("Initial Map: " + map);

        // 🔸 Update (same key replaces value)
        map.put(2, "Orange");
        System.out.println("After Update: " + map);

        // 🔸 Access value
        System.out.println("Value for key 1: " + map.get(1));

        // 🔸 Remove element
        map.remove(3);
        System.out.println("After Deletion: " + map);

        // 🔸 Check key/value
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value Mango? " + map.containsValue("Mango"));

        // 🔸 Size
        System.out.println("Size: " + map.size());

        // 🔸 Loop (Printing)
        System.out.println("Using Entry Set:");
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 🔸 Clear
        map.clear();
        System.out.println("After Clearing: " + map);
    }
}

