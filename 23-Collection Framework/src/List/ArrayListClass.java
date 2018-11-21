package List;

import java.util.*;

public class ArrayListClass {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<Integer>();
		
		values.add(5);
		values.add(10);
		values.add(1, 9);
		values.add(20);
		System.out.println(values);

		Collections.sort(values);
		System.out.println(values);
		
		for (int x:values) {
			System.out.println(x);
		}
	}

}
