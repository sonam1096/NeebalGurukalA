package practice;
import java.util.*;
public class String18 {

	public static void main(String[] args) {
		// Morse Code Converter: Develop a program that converts a string into Morse code and vice versa
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentance");
		String str1 = sc.nextLine();
		String str[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
			"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		
		String s1=str1.toUpperCase();
		String space="";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch==' ')
				continue;
			space+=str[(int)ch-65];
		
	  }
		System.out.println(space);

	 
	}
	
	
	
	

}
