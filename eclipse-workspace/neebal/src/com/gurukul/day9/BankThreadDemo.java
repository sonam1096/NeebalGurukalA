package com.gurukul.day9;

class bank{
	String name;
	double amount;
	bank(String n,double d){
		this.name=n;
		this.amount=d;
	}
	synchronized void deposit(double am) {
		System.out.println("came amount :"+amount);
		amount +=am;
		System.out.println("Deposit amount:"+amount);
	}
	synchronized void withdraw(double am) {
//		System.out.println("amount:"+amount);//
		amount-=am;
//		System.out.println("Withdraw amount:"+amount);
	}
	public String toString() {
		return name+" "+amount;
	}
}
class BankThread extends Thread{
	String operation;
	bank acc;
	double amount;
	BankThread(String op,bank acc,double amount){
		this.operation=op;
		this.acc=acc;
		this.amount=amount;
		start();
	}
	
	public void run() {
		//System.out.println("[");
		if(operation.equals("deposit")) 
		{
			acc.deposit(amount);
		}
		else
		{
			acc.withdraw(amount);
		}
		//System.out.println("]");
	}
	
}

public class BankThreadDemo 
{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     bank x=new bank("Rajashri",20000);
     bank y=new bank("vishwa",10000);
     
     BankThread b1=new BankThread("deposit",x,5000);
     BankThread b2=new BankThread("withdraw",y,5000);
     BankThread b3=new BankThread("withdraw",x,2500);
     
     b1.join();
     b2.join();
     System.out.println(x);
     System.out.println(y);
	}

}
