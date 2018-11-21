
public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1=12;
		int i2=5;
		float f1=15.5f;
		double d1=20.5;
		String msg="hello";
		
		int res1=i1+i2;
		float res2=i1+f1; //auto cast
//		int res2=i1+f1; //it will complain, needs casting
		double res3=i2+d1;//auto cast
//		float res3=i2+d1;//it will complain, needs casting
		
		String res4=msg+f1;
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		
		byte b1=12;
		int i3=12;
		byte b2=20;
		
	/*
		 *The result of an expression involving anything int-sized or smaller variable is always INTEGER INT. 
		 *If you add two bytes together, you will get an INTEGER INT.
		 *and addition, multiplication, substraction, division integral var compile the value as INTEGER INT,
		 *so there is a need to cast
		 * 
	*/
		
//		byte resByte = b1+b2; complains because it has to be integer or long
//		int resByte = (byte)b1+b2; // casts only 1
		byte resByte = (byte)(b1+b2);
		byte resByte1=20+12;
		int resByte2 = b1+b2;
		long resByte3 = b1+b2;
		float resByte4 = b1+b2;
		
		int res8 = (byte) (126+2);
		System.out.println(res8);
		
		
		
		byte b = 126;
        for(int i = 0; i <=19; i++) {
            System.out.print(b + " ");
            b++;
        }
        
        

        
        
        
        
		
	}

}
