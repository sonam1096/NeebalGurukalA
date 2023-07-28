package com.gurukul.day8;
import java.util.*;
public class unicode {

	public static boolean check(int a) throws Exception{
		if(Character.isAlphabetic(a)) {
			return true;
		}
		else if (Character.isDigit(a)) {
			return false;
		}
	
		throw new Exception();
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter unicode :");
		int i=sc.nextInt();
		
       try {
    	  
		if(unicode.check(i)) 
    		   System.out.println("It is Alphabet");
    	   
    	   else
    		   System.out.println("It is a digit");
       }
       catch(Exception e) {
    	   System.out.println("Special Character");
       }
    		   
    	   
    	   
    	   
    	   
    	   
   }
       
       
 
       
}
      
		
	


