package practice;

import java.util.Comparator;

class Node<T>{
 
	private T data;
	private Node<T> next;
	public T getData() {
		return data;
   }
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	void setNext(Node<T> next) {
  this.next = next;
 }
	public Node(T data, Node<T> next) {
  
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
		if(first==null) {
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
 
//Method to count the number of nodes in the linked list
 public int count() {
     int count = 0;
     Node<T> temp = first;
     while (temp != null) {
         count++;
         temp = temp.getNext();
     }
     return count;
 }

 // Method to find the largest element in the linked list
 public T max() {
     if (first == null) {
         return null; 
     }

     Comparator<T> comparator = (Comparator<T>) Comparator.naturalOrder();
     T maxData = first.getData();
     Node<T> temp = first.getNext();

     while (temp != null) {
         if (comparator.compare(temp.getData(), maxData) > 0) {
             maxData = temp.getData();
         }
         temp = temp.getNext();
     }
     return maxData;
 }

 // Method to insert a new node with the given data after a node with the specified data
 public boolean insert(T data, T afterdata) {
     Node<T> temp = first;
     while (temp != null) {
         if (temp.getData().equals(afterdata)) {
             Node<T> newNode = new Node<T>(data, temp.getNext());
             temp.setNext(newNode);
             return true;
         }
         temp = temp.getNext();
     }
     return false;
 }

 // Method to delete the node containing the given data
 public boolean delete(T data) {
     if (first == null) {
         return false; 
     }

     if (first.getData().equals(data)) {
         first = first.getNext();
         return true;
     }

     Node<T> prev = first;
     Node<T> current = first.getNext();
     while (current != null) {
         if (current.getData().equals(data)) {
             prev.setNext(current.getNext());
             return true;
         }
         prev = current;
         current = current.getNext();
     }
     return false;
 }

 // Method to reverse the linked list
 public void reverse() {
     Node<T> prev = null;
     Node<T> current = first;
     Node<T> next;

     while (current != null) {
         next = current.getNext();
         current.setNext(prev);
         prev = current;
         current = next;
     }
     first = prev;
 }

 // Method to insert a new node with the given data at the specified index
 public boolean insertAt(T data, int index) {
     int size = count();
     if (index < 0 || index > size) {
         return false; 
     }

     if (index == 0) {
         Node<T> newNode = new Node<T>(data, first);
         first = newNode;
     } else {
         Node<T> temp = first;
         for (int i = 0; i < index - 1; i++) {
             temp = temp.getNext();
         }
         Node<T> newNode = new Node<T>(data, temp.getNext());
         temp.setNext(newNode);
     }
     return true;
 }
 
}
public class list{

 public static void main(String[] args) {
  // TODO Auto-generated method stub

LinkedList<Integer> x = new LinkedList<Integer>();
x.add(10);
x.add(20);
x.add(30);
x.add(40);
System.out.println("Linked List: " + x);

int count = x.count();
System.out.println("count the node: " + count);

Integer max = x.max();
System.out.println("Largest element in  list: " + max);

boolean inserted = x.insert(25, 20);
System.out.println("Inserted 25 after 20: " + inserted);
System.out.println("Updated Linked List: " + x);

boolean deleted = x.delete(30);
System.out.println("Delete 30: " + deleted);
System.out.println("Updated Linked List: " + x);

x.reverse();
System.out.println("Reversed Linked List: " + x);

boolean insertedAtIndex = x.insertAt(35, 3);
System.out.println("Inserted 35 at index 3: " + insertedAtIndex);
System.out.println("Updated Linked List: " + x);
}

}

