package com.gurukul.day10;

public class Recursive4 {
private static int Max(int n) {
		if(n/10==0) {
			
			return 0;
		}
		else
		{
			int a=n%10;
			int b=n/10;
			
			if(a>Max(b)) {
				return a;
			}
			else {
				return Max(b);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int max=Max(123456789);
    System.out.println(max);
	}

	

}
