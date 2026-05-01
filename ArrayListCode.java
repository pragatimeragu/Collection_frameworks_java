// ArrayList 
import java.util.*;
public class ArrayListCode {
	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();

	//Inserting elements to list
	list.add("Apple");
	list.add("Mango");
	list.add("Banana");
	list.add("Orange");
	list.add("Guava");
	list.add("watermelon");

	//Access element
	System.out.println("list:"+ list);

	// update element by index
	list.set(2,"Pineapple");
	System.out.println("updated list:"+ list);

	//delete element by index
	list.remove(1);
	System.out.println("updated list after deletion :"+ list);

	//Delete by value
	list.remove("Apple");
	System.out.println("After Deletion (value): " + list);

	 //Check element
	System.out.println("Contains Mango? " + list.contains("Mango"));

	//size of list
	System.out.println("size:"+ list.size());


	// loop printing
	System.out.println("Using Loop:");
    for(String item : list) {
            System.out.println(item);
     }


      // 🔸 Clear list
    list.clear();
    System.out.println("After Clearing: " + list);

}

}
