package com.gurukul.day8;

import java.util.Scanner;
public class indexof {

	
public static void main(String[] args) {

		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter a name:");
		     String s1=sc.nextLine();
		        
		    int j=0;
		     String s="hi";
		     int count=0;
		    while ( (j=s1.indexOf(s, j))!=-1) {
		    	count++;
		    	j++;
		     }
		     System.out.println(count);
		     
	}

}





