package Map;

import java.util.*;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map map = new HashMap();
		Map<String,String> map = new HashMap<>();
		map.put("MyName", "Mike");
		map.put("MyJob", "Dev");
		map.put("MyAge", "25");
		map.put("x", "y");
		
		System.out.println(map);
		
		System.out.println(map.get("MyName"));
		System.out.println(map.get("MyName2"));
		
		Set<String> keys = map.keySet();
		
		for (String key:keys) {
			System.out.println(key+" "+map.get(key));
		}
		
	}

}
