package com.gurukul.day11;

class Node<T>{
		private T data;
		Node<T> next;
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node<T> getNext() {
			return next;
		}
		public void setNext(Node<T> next) {
			this.next = next;
		}
		public Node(T data, Node<T> next) {
			super();
			this.data = data;
			this.next = next;
		}
		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}
		
	}

	class LinkedList<T>{
		private Node<T> first=null;
		void add(T data) {
			Node<T> newnode=new Node<T>(data,null);
			if(first==null) 
			{
				first=newnode;
			}
			else
			{
				Node<T> temp=first;
				while(temp.getNext()!=null)
				{
					temp=temp.getNext();
				}
				temp.setNext(newnode);
			}
		}
		public String toString() {
			String msg="[";
			Node<T> temp=first;
			while(temp!=null)
			{ 
			 msg+=(temp.getData()+" ");
			 temp=temp.getNext();
			}
			msg+="]";
			return msg;
		}
		public int count() {
			Node<T> temp=first;
			int count = 0;
			while(temp!=null)
			{
			temp=temp.getNext();
			count++;
		}
		return count;
	}
		//delete the data
		boolean  fdelete(T data) {
			if(first==null) {
				System.out.println("Empty");
				return false;
			}
			first=	first.next;
				return true;
		}
		boolean ldelete(T data) {
			
			if(first==null) 
				//System.out.println("Empty");
				return false;
			 
			
			else {	
			Node<T> last=first;
			Node<T>slast=first.next;
			while(last.next!=null) 
			{
				 
				last=last.next;
				slast=slast.next;
				System.out.println(slast);
				return true;
			}
			slast=slast.next;
		}
			return false;
		}
			
 }
			


public class LinkedListDemo {
 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	LinkedList<Integer> x=new LinkedList<Integer>();
	x.add(10);
	x.add(20);
	x.add(30);
	x.add(40);
	System.out.println(x);
    System.out.println(x.count());
    System.out.println(x.fdelete(1)+" "+x);
    System.out.println(x.ldelete(4)+" "+x);
		
		
	}
}

