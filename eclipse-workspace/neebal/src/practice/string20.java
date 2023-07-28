package practice;

import java.util.Scanner;

public class string20 {

	public static void main(String[] args) {
		//Title Case: Write a program that converts a given sentence to title case, where the first letter of each word is capitalized
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a sentence:");
	      String s1=sc.nextLine();
		
		String s[] = s1.split(" ");
		String Tcase="";
		for(String a:s) {
			Tcase+=a.substring(0,1).toUpperCase()+a.substring(1)+" ";
		}

		System.out.println(Tcase);
			
	}

}
