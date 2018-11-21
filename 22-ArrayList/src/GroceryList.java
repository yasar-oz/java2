import java.util.*;

public class GroceryList {

	//List groceryList = new ArrayList(); //any data type
	
//	List<Integer> groceryList = new ArrayList<Integer> (); //Only Integer datatype, It must be a Wrapper class 
	List<String> groceryList = new ArrayList<String> (); //Only String datatype
	
	public void addGroceryItem (String item) {
		groceryList.add(item);
	}
	
	public void printGroceryList() {
		System.out.println("You have "+groceryList.size());
		for (int i=0;i<groceryList.size();i++) {
			System.out.println((i+1)+ "."+groceryList.get(i));
		}
	}
	
	public void modifyGroceryItem(int position, String newItem) {
		if (groceryList.isEmpty()) {
			System.out.println("Basket is empty");
		} else {
			groceryList.set(position, newItem);
		}

	}
	
	public void removeGroceryItem(int position) {
		groceryList.remove(position);
	}
	
	public String findItem(String searchItem) {
//		boolean exists = groceryList.contains(searchItem); 
		int position = groceryList.indexOf(searchItem);
		if (position>=0) {
			return groceryList.get(position)
		}
		return null;
		
	}
	
	
}
