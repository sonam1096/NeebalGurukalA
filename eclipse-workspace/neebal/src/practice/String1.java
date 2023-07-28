package practice;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //Remove Whitespace: Write a program that takes a sentence as input and removes all the whitespace characters from it
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a sentence:");
	      String s1=sc.nextLine();
		
	      
	      String s[]=s1.split(" ");
	      s1="";
	      
	      for(int i=0;i<s.length;i++) {
	     	 s1=s1+s[i];
	      }
	      System.out.println(s1);
	      
	      
		
	}

}
