package practice;
import java.util.*;
public class String7 {
//run   Caesar Cipher: Implement a program that encrypts and decrypts a string using the Caesar cipher technique.
	
public static void main(String[] args) {
		    // TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter a word :");
			String s = sc.next();
			 String s1="";
			    for(int i=0;i<s.length();i++) {
			      
			    char ch=s.charAt(i);
			    
			      ch+=3; 
			      s1+=ch;
			      System.out.print(ch+"");
			    }
			    
			    for(int i=s.length();i>0;i--) {
			      
			      char ch=s1.charAt(s1.length()-i);
			      
			        ch+=3; 
			      

			        System.out.print(ch);
	       }

		}

	}
		   
		    
		   
