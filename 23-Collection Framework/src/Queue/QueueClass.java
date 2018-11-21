package Queue;

import java.util.*;

public class QueueClass {

	public static void main(String[] args) {
	

		Queue<Integer> q = new PriorityQueue<Integer>();
		
		for (int i=0;i<5;i++) {
			q.add(i);
		}
		
		System.out.println(q); //0-1-2-3-4
		
		int removedel = q.remove();
		System.out.println(removedel); // First element of the set 0
		System.out.println(q);  // Order is not preserved 1-3-2-4
		System.out.println(q.peek()); //First element
		System.out.println(q.size()); 
	}

}
