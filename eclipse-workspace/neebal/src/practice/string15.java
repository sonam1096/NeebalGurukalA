
package practice;

import java.util.Scanner;

public class string15 {// run

	public static void main(String[] args) {
		// Reverse Words in a Sentence: Implement a program that reverses the order of words in a given sentenc
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word :");
		String str = sc.nextLine();
		String s[]=str.split(" ");
		
		String rev="";
		for(int i=s.length-1;i>=0;i--) {
			 
			rev+=s[i]+" ";
		}
		System.out.println(rev);
		
		
		
		
		
		
//		String s1[]=s.split(" ");
		//StringBuffer sb=new StringBuffer(s);
		   
		 // for(int i=0;i<sb.length();i++) 
		//  {
			 // sb.reverse();
			  //System.out.println(sb.reverse());
		//  }
	}

}
