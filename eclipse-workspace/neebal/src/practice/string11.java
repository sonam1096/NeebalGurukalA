package practice;

import java.util.Scanner;

public class string11 {

	public static void main(String[] args) {
		//. Count Words in CamelCase: Create a program that counts the number of words in a CamelCase string. For example, "thisIsCamelCase" has 4 words
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a sentence:");
	      String s1=sc.nextLine();
		
		
		int count=1;
		for(int i=0;i<s1.length();i++){
			if(Character.isUpperCase(s1.charAt(i))) {
				count++;
			}
		}
		
		System.out.println(count);
	

	}

}
