package com.gurukul.day8;
import java.util.*;
public class compare {

	public static void main(String[] args) {
		//  TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first name:");
       String s1=sc.nextLine();
       System.out.println("Enter the second word:");
       String s2=sc.nextLine();
       System.out.println("Enter the last name:");
       String s3=sc.nextLine();
       
       
       if(s1.equals(s3)) {
    	   System.out.println("They are equal");
       }
       else {
    	   
    	   String s4=s1.concat(" "+s3);
    	    System.out.println(s4);
       }
	}

}
