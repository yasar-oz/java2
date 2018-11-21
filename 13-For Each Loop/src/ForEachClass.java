
public class ForEachClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {125,132,95,116,110};
		int highestMark = maximum (marks);
		System.out.println(highestMark);
		
	}
	
	public static int maximum (int[] array) {
		int max=array[0];
		for (int num : array) {
			if (num>max) {
				max=num;
			}
		}
		return max;
	}
}
