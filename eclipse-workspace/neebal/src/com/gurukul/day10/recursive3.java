package com.gurukul.day10;

public class recursive3 {
	
	public static int GCD(int x,int y) {
		if(x%y==0) {
			return y;
		}
		else
		{
		int z=	GCD(y,x%y);
				return z;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int gcd= GCD(175,125);
        System.out.println(gcd);
		
		
	}

}
