package practice;
import java.util.*;
public class string4 {
//run
	public static void main(String[] args) {
		// Check Balanced Parentheses: Develop a program that checks whether a given string containing parentheses is balanced or no
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String s = sc.next();

		int count=0;

		for (int i = 0; i < s.length(); i++) {
		    if (s.charAt(i) == '(') {
			count++;
		    }  if (s.charAt(i) == ')') {
			count--;
		    }
		    if (count<0) {
		
			break;
		    }
		}
		if (count==0) {
		    System.out.println("Paranthesis is balanced");
		} else {
		    System.out.println("Paranthesis not balanced");
		}

	    } 
}
	

