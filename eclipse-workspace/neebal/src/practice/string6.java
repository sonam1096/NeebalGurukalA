package practice;

import java.util.Scanner;

public class string6 {
//run
	public static void main(String[] args) {
		// Replace Characters: Create a program that replaces all occurrences of a  specified character with another character in a given string
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a sentence:");
	      String s1=sc.nextLine();
	      System.out.println("Enter a character:");
	      char ch=sc.nextLine().charAt(0);
	      System.out.println("Enter a character:");
	      char ch1=sc.nextLine().charAt(0);
	      
	      char s[]=s1.toCharArray();
	      for(int i=0;i<s.length;i++) {
	    	  if(s[i]==ch1) {
	    		  s[i]=ch;
	    	  }
	      }
	      System.out.println(s);
	      
	      
	}

}
