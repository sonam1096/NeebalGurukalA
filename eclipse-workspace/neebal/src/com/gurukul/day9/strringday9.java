package com.gurukul.day9;
import java.util.*;
public class strringday9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a sentence :");
     String str=sc.nextLine();
     System.out.println("Enter a word");
     String word=sc.nextLine();
		 
     
     StringBuffer sb=new StringBuffer(str);
  
     
	    int j=0;
	     
//	     String space="";
	    while ( (j=sb.indexOf(word, j))!=-1) {
	    	sb.delete(j,j+word.length());
	    	 
	     }
	    System.out.println(sb);
	     
	}

}
