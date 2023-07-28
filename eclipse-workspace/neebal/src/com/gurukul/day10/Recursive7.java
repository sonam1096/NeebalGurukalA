package com.gurukul.day10;

public class Recursive7 {
	public static int Product(int x,int y) {
		if(x==0) {
			return 0;
		}
		else {
			return Product(x/2,y*2)+y*(x%2);
			/*if(x%2!=0) {
				int c=Product(x/2,y*2)+y;
				return c;
			}
			else {
				return Product(x/2,y*2);
			}*/
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int mul=Product(190,10);
     System.out.println(mul);
	}

}		
			
			
			
		
	

	
