package com.gurukul.day8;

import java.util.*;  

public class exceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Input");
     String n=sc.nextLine();
      
    // String n="123.5";
      
     
     try {
    	  
    	 
    int	 a=Integer.parseInt(n);
    	 System.out.println("Convertable into Integer"+a);
    	 
     } 
     catch(Exception e){
    	 
    	 try {
    		double b=Double.parseDouble(n);
        	 System.out.println("Convertable into double :"+b);
        	 
    	 }
    	 catch(Exception f){
    		 
    		 System.out.println("Not Convertable"+f);
    		 
    	 }
    	 
     }
     
     
	}		
}

