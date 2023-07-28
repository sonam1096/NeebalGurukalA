package practice;

import java.util.Scanner;

public class string9 {

	public static void main(String[] args) {
		// String Rotation: Write a program to check if one string is a rotation of another. For example, "abcd" is a rotation of "cdab.
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter first string");
	     String str=sc.nextLine();
	     System.out.println("enter second string");
	      String rev=sc.nextLine();
	     
	       if(str.length()!=rev.length()) {
	    	   System.out.println("Not");
	       }
	       else {
	    	   String s3=str+str;
	    	   if(s3.indexOf(rev)!=-1) {
	    		   System.out.println("rotation");
	    	   }
	       }
}
}