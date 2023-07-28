package practice;

import java.util.Scanner;

public class string5 {//run

	public static void main(String[] args) {
		// Count Words: Write a program that counts the number of words in a given sentence.
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a sentence:");
	      String s1=sc.nextLine();
	      
	      String s[]=s1.split(" ");
//	      s1="";
//	      
//	      int count=0;
//	      for(int i=0;i<s.length;i++) {
//	    	  
//	    	  count++;
//	      }
//	      System.out.println(count);
	      
	      System.out.println(s.length);
	}

}
