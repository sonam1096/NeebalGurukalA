package com.gurukul.day10;

public class Recursive8 {
	
	public static int VowelCount(String s) {
		if(s.isEmpty())
			return 0;
		else {
		char ch=s.charAt(0);
	
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
		{
		 return 1+VowelCount(s.substring(1));
		}
		else
		{
			return VowelCount(s.substring(1));
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="Vishawjeet";
     System.out.println(str);
     int a=VowelCount(str);
     System.out.println(a);
	}

}
