package List;

import java.util.*;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> object = new LinkedList<String>();
		
		object.add("A");
		object.add("B");
		object.addLast("C"); //index last
		object.addFirst("D"); //index 0
		object.add(2,"E"); //index 2
		object.add("F");
		object.add("G");
		
		System.out.println(object);
		object.remove("B");
		System.out.println(object);
		object.remove(3);
		System.out.println(object);
		object.removeFirst();
		System.out.println(object);
		object.removeLast();
		System.out.println(object);
	}

}
