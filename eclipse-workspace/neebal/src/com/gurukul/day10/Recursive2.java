package com.gurukul.day10;

public class Recursive2 {
	
	public static double Power(double b,double p) {
		double power;
		 if (p==0)
			 return 1;
		 else if(p==1)
		 return b;
		 else
			 power=Math.pow(b, p-1);
		 return power;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		double power;
		
		power=Math.pow(2, 5);
	  
		System.out.println(power);
	}

}
