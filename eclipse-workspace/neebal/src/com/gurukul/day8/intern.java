package com.gurukul.day8;

import java.util.Scanner;
public class intern {
 

public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a sentence:");
      String x=sc.nextLine();
			String y="is";	
		
			int i=0;
		while(x.indexOf(y)!=-1) {
		 i=x.indexOf(y);
		x= x.substring(0,i)+x.substring(i+y.length());
		 System.out.println(x);
		}	
	 }
				     
	}


