package com.gurukul.day8;
import java.util.*;
public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a name:");
     String s1=sc.nextLine();
        
     String s[]=s1.split(" ");
     s1="";
     
     for(int i=0;i<s.length;i++) {
    	 s1+=s[i]+" ";
     }
     System.out.println(s1);
     
	}

}
