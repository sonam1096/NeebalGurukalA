package com.gurukul.day8;


class Outer{
	int x=5;
	static int y=6;
	
	void set(int x) {
		this.x=x;
	}
class Inner{
	int a=7;
	static int b=8;
	 
	void set(int a) {
		this.a=a;
	}
	void printInner() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
	void printOuter() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(Inner.b);
	}
}
}
public class innerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Outer obj1=new Outer();
		Outer obj2= new Outer();
		Outer.Inner in1=new Outer.Inner();
		Outer.Inner in2=new Outer.Inner();
		Outer.Inner in3=new Outer.Inner();
		
	}

}
