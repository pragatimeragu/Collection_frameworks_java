import java.util.*;
public class LinkedListCode
{
	public static void main(String[] args) {

	// Creating LinkedList
	LinkedList<String> list = new LinkedList<>();

	 //  Insertion
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

     System.out.println("Initial List: " + list);

      // 🔸 Insert at beginning
      list.addFirst("Grapes");

       // 🔸 Insert at end
      list.addLast("Pineapple");

      // 🔸 Insert at index
       list.add(2, "Cherry");

      System.out.println("After Insertions: " + list);


       // 🔸 Access element
       System.out.println("Element at index 3: " + list.get(3));

        // 🔸 Update element
        list.set(3, "Kiwi");
        System.out.println("After Update: " + list);

        // 🔸 Delete operations
        list.remove(2);              // by index
        list.remove("Apple");        // by value
        list.removeFirst();          // first element
        list.removeLast();           // last element

        System.out.println("After Deletions: " + list);


        // 🔸 Size
        System.out.println("Size: " + list.size());


        // 🔸 Check element
        System.out.println("Contains Mango? " + list.contains("Mango"));

        // 🔸 Printing using loop
        System.out.println("Using Loop:");
        for(String item : list) {
            System.out.println(item);
        }

        // 🔸 Clear list
        list.clear();
        System.out.println("After Clearing: " + list);
		
	}
}