package com.gurukul.day10;

public class Recursive5 {
	
	public static String Reverse(int n) {
		if(n/10==0) {
			return n+"";
		}else {
		
			return (n%10)+Reverse(n/10);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String rev=Reverse(1234);
    System.out.println(rev);
	}

}
