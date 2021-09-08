package linkedList;

import linkedList.LinkedList.Node;

public class List {

	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public void insert(Node l ,int data) {
		Node curr = new Node(data);
		Node last;
		
		if(l == null ) {
			head = curr;
		}else
		{
			last = l;
			while(last.next != null) {
				last = last.next;				
			}
			last.next = curr;
		}
		//return l;
	}
	
	public static void print(Node head) {
		Node curr=head;
		System.out.println("In print");
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
	
	public static void main(String args[]) {
		
		List l = new List();
		
		l.insert(l.head, 13);
		l.insert(l.head, 14);
		l.insert(l.head, 15);
		l.insert(l.head, 16);
		l.insert(l.head, 17);
		
		print(l.head);
	}
}
