package com.cybertek.package2;

//import com.cybertek.package1.*;
//import com.cybertek.package1.Class1; 


public class Class2 {

	public static void main(String[] args) {
		// There are 3 ways to access package from outside the package
		//1- Import package.*
		//2- Import package.ClassName
		//3- fully qualified name
		com.cybertek.package1.Class3 cl = new com.cybertek.package1.Class3(); //fully qualified name

	}

}
