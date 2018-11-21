
public class DataTypes {

	public static void main(String[] args) {
		//byte
		byte b1=25;
		byte b2=-128;
		byte b3=127;
		System.out.println(b1+"|"+b2+"|"+b3);
		//byte b4=128; can not convert int to byte
		System.out.println("----------");
		//short
		short s1=500;
		short s2=-32768;
		short s3=32767;
		//s4=32768;
		System.out.println(s1+"|"+s2+"|"+s3);
		System.out.println("----------");
		
		//int
		
		int i1=-50000;
		int i2=100_000; //to make it readable
		int i3 = 50000; //it is optional
		System.out.println(i1+"|"+i2+"|"+i3);
		System.out.println("----------");
		
		//long
		long l1=100_000_000;
		long l2=214783949031L; //need L
		System.out.println(l1+"|"+l2);
		System.out.println("----------");
		
		//float:floating point types have double as default type
		float f1=5.2f;
		double d1=5.2;
		System.out.println(f1+"|"+d1);
		System.out.println("----------");
		
		//boolean
		boolean bool=true;
		boolean bool2=false;
		
		//char
		char c1='D';
		char c4='\u00A9'; //unicode for copyright
		System.out.println(c4); //from unicode-table.com
		
		
		
	}

}
