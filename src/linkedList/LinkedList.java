package linkedList;

import java.util.Scanner;

public class LinkedList {

	/*static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	static Node head;
	
	public static void main(String agrs[]) {
		LinkedList a = new LinkedList();
		a.head = new Node(13);
		a.head.next = new Node(14);
		a.head.next.next = new Node(15);
		print(a.head);
		System.out.println("");
		a.head = reverse(a.head);
		print(a.head);
		
	}
	
	public static Node reverse(Node a) {
		Node curr=a,prev = null,next;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	public static void print(Node head) {
		Node curr=head;
		System.out.println("In print");
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}*/
	/* second trial
	 * class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
			next = null;
		}
	}
	Node head;

	public static void main(String[] args){
		LinkedList l1 = new LinkedList();
		l1.insert(2,l1.head);		
		l1.insert(3,l1.head);
		l1.insert(4,l1.head);
		l1.insert(5,l1.head);
		l1.print(l1.head);
		System.out.println("");
		l1.head = l1.reverse(l1.head);
		l1.print(l1.head);
	}
	
	public void insert(int data,Node h){
		Node new_node = new Node(data);
		Node curr;
		if(h == null){
			head = new_node;	
		}else{
			curr = h;
			while(curr.next != null){
				curr = curr.next;
			}
			curr.next = new_node;
						
		}
	}

	public Node reverse(Node head){
		if(head == null){
			return null;
		}else{
			Node curr = head,prev = null,next = null;
			do{
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			}while(next != null);
			return prev;
		}
	}
	

	public void print(Node head){
		Node curr = head;
		while(curr != null){
			System.out.println(curr.data +" ");
			curr = curr.next;
		}
	}*/
	
	static class Node{
		int data;
		Node next;

		public Node(int data){
			this.data = data;
			next = null;
		}
	}

	static Node head;

	public static void main(String[] args){
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		print();
		reverse();
		print();
	}

	public static void insert(int d){
		Node new_node = new Node(d);
		
		if(head == null){
			head = new_node;
			return;
		}	
		Node curr = head;

		while(curr.next != null){
			curr = curr.next;
		}
		
		curr.next = new_node;
	}
	
	public static void reverse(){
		Node curr = head,next = null, prev = null;
		
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		head = prev;
	}

	public static void print(){
		Node curr=head;

		while(curr != null){
			System.out.print(curr.data+ " ");
			curr = curr.next;
		}

			System.out.println();
	}
}
