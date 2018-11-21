
public class Main {

	public static void main(String[] args) {
		
//charAt(index) - returns chsr value for the particular index
		
		String str = "  Javascript  ";
		System.out.println(str.charAt(3));
		
//length() - returns string length
		
		System.out.println(str.length());
		
//substring(int beginIndex) - returns substring for given begin index
		
		System.out.println(str.substring(5));
		
//substring(int beginIndex,int endIndex) - returns substring for given begin index (last index is not included)
		
		System.out.println(str.substring(2,6));
		
//contains() - returns boolean after matching the value
		
		System.out.println(str.contains("va"));
//equals(Object another) - checks the equality with the given object
		
		System.out.println(str.equals("Javascript"));
		
//isEmpty() - checks if the string is empty
		
		System.out.println(str.isEmpty());
		
//concat(string str) - concatenates the specified string
		
		System.out.println(str.concat("Batch9"));
		
//replace(char old, char new) - replaces all occurences of specified char value
		
		System.out.println(str.replace("script", ""));

//equalsIgnoreCase(string another) - returns a split matching delimeter
		
		String str2 = "Javascript is the best batch ever";
		String [] myArray = str2.split(" ");
		for (String word:myArray) {
			System.out.println(word);
		}
//indexOf(char/String ch) - returns the specified char value index
		
		System.out.println(str.indexOf('v'));
		
//indexOf(String substring, int fromIndex) - returns the index starting from fromIndex
		
		System.out.println(str.indexOf('a',1));
		
//toLowerCase() - returns a string in lowercase
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
//trim() - removes beginning and ending spaces 

		System.out.println(str.trim());

		
		
		
		
		
		
		
		
		
		

	}

}
