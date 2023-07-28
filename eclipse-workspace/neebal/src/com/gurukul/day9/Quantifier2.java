package com.gurukul.day9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier2 {

	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a sentence");
		  String str=sc.nextLine();
		   
		  String s[]=str.split(" ");
	      str="";
	      
	      for(int i=0;i<s.length;i++) {
	     	 str=str+s[i];
	      }
	      System.out.println(str);
	      
		  
	      
	      
	      
	      
		  String regex="^[\\w][a-zA-Z0-9]{2}";
		   
		    Pattern pattern=Pattern.compile(regex);
		    Matcher matcher=pattern.matcher(str);
		    
		   /* for(int i=0;i<st.length;i++) {*/
		    	
		    	if(matcher.matches()) {
		    	  System.out.println("String matches");
		         }
		         else {
		    	  System.out.println("String not matches");
		        
		    }   

		

	}

}
