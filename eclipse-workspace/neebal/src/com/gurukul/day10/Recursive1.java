package com.gurukul.day10;

public class Recursive1 {
	
	
	public static int Sum(int n) {
		int sum;
		if(n==0) {
			return 0;
		}
		else {
			 sum=Sum(n-1)+n;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5,sum=0;
    	 sum= Sum(5);
    	  System.out.println(sum);
      
	}


}
