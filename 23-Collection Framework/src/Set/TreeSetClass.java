package Set;

import java.util.*;

public class TreeSetClass {

	public static void main(String[] args) {

		Set<Integer> values = new TreeSet<Integer>();
		values.add(15);
		values.add(19);
		values.add(6);
		values.add(6);
		values.add(8);
		values.add(88);
		for (int x:values) {
			System.out.println(x);  //Shows in ascending order
		}
		System.out.println(values);
	
	}

}
