package practice;
import java.util.*;
public class string14 {

	public static void main(String[] args) {
		// . URL Parser: Create a program that extracts the domain name from a given URL.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter URL");
		String s1 = sc.nextLine();
		String[] arr = s1.split("/");
		
		System.out.println(arr[2]);
		
	}

}
