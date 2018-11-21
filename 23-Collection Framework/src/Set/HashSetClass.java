package Set;

import java.util.*;

public class HashSetClass {

	public static void main(String[] args) {

		Set<Integer> values = new HashSet<Integer>();
		values.add(15);
		values.add(19);
		values.add(6);
		values.add(6);
		values.add(8);
		values.add(88);
		for (int x:values) {
			System.out.println(x);  //19 6 8 88 15
		}
		System.out.println(values);
			
		
		
	}

}
