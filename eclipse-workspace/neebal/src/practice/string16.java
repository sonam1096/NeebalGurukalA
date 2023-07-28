package practice;
import java.util.*;
public class string16 {
   
	  //Valid Palindrome: Write a program that checks if a given string is a valid palindrome, considering only alphanumeric characters and ignoring cases
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub  run
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		
		
		String rev="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			rev=ch+rev;
		}
		//System.out.println(rev);
		if(str.equalsIgnoreCase(rev.trim())){
			System.out.println("Given string is valid palindrome:"+rev);
		}else {
			System.out.println("Invalid");
		}
		
		
		
		
		
		
		
		
	/*	 String s="121";
		   String s1[]=s.split(" ");
		   int ans=1;
		   for(int i=0;i<s1.length/2;i++)
		   {
		     if(s.charAt(i)==s.charAt(((s1.length/2)-1)-i))
		     
		       continue;
		     
		     else
		         ans=0;
		        
		     System.out.println(ans);
		     
		   }
		 

		 if(ans!=1)
		 
		   System.out.println("Not Palindrom");

		 
		 else
		 
			 System.out.println(" Palindrom");*/
		 
	}

}
