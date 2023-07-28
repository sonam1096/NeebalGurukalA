package com.gurukul.day9;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class quantifires {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str=sc.nextLine();
		//String st[]=str.split(" ");
		
		 
	    
	    //write a regix to match "true"/"True"
	    String regex="^[\\D][a-zA-Z0-9]{2}";
	    
	  
	    
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
