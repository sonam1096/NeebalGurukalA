package com.gurukul.day9;

class Task implements Runnable{
	String msg="Hello";
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(msg) {
		for(int i=0;i<=5;i++) {
		
			System.out.print("/");
			
			try {msg.notify();
			msg.wait();
				Thread.sleep(10);
				
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	}
	
}
	  
 
	

public class threadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
			Thread curth=new Thread(new Task()); 
			String msg="Hello";
	        Thread th=new Thread(new Runnable() {
	        	public void run() {
	        		// TODO Auto-generated method stub
	        		
	        		synchronized(msg){
	        		for(int i=0;i<=5;i++) {
	        		
	        			System.out.print("*");
	        			msg.wait();
	        			msg.notify();
	        			try {
	        				Thread.sleep(10);
	        				
	        			}
	        			catch(InterruptedException e) {
	        				e.printStackTrace();
	        			}
	        		}
	        	}
	        	}
	        });
	        curth.start();
	        th.start();
}
}