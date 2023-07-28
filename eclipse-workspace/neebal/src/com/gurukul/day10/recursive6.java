package com.gurukul.day10;

public class recursive6 {
	public static String Binary(int n) {
		if(n==0 || n==1) {
			return n+"";
		}
		else {
			String str=Binary(n/2)+(n%2);
			return str;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String binary=Binary(18);
     System.out.println(binary);
	}

}
