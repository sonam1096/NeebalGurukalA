package practice;

import java.util.Scanner;

public class string2 {//run

	public static void main(String[] args) {
		// Find Substring: Create a program that finds all occurrences of a given substring within a larger string
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a sentence:");
	      String str=sc.nextLine();
	     System.out.println("Enter a word :");
	      String v=sc.nextLine();
	      
	      String s = "";
			for (int i = 0; i < str.length(); i++) {
			    char ch = str.charAt(i);
			    if (s.indexOf(ch) == -1) {
				s += ch;
			    }
			}
			for (int i = 0; i < s.length(); i++) {
			    int count = 0;
			    for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (ch == s.charAt(i)) {
				    count++;
				}
			    }
			    System.out.print( s.charAt(i)+"" + count);
			}
		   

	      
	      
	}

}
