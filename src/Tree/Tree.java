package Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Tree {
	/*Node root;
	
	public class Node{
		int data;
		Node left,right;
		
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public void insert(int data, Node temp) {
		 Node new_node = new Node(data);
		 
		 if(temp == null) {
			 root = new_node;
			 return;
		 }
		 
		 LinkedList<Node> a = new LinkedList<Node>();
		 a.add(temp);
		 
		 while(!a.isEmpty()) {
			 temp = a.peek();
			 a.remove();
			 
			 if(temp.left == null) {
				 temp.left = new_node;
				 break;
			 }else
				 a.add(temp.left);
			 if(temp.right == null) {
				 temp.right = new_node;
				 break;
			 }else
				 a.add(temp.right);
			 
		 }
		 
	}
	
	public void printInorder(Node root) {
		
		if(root == null) {
			return;
		}
		
		printInorder(root.left);
		System.out.print(root.data+ " ");
		printInorder(root.right);
	}
	
	public void insertBST(int key,Node temp) {
		Node new_node = new Node(key);
		
		if(temp == null) {
			root = new_node;
			return;
		}
		
		LinkedList<Node> l = new LinkedList<Node>();
		l.add(temp);
		
		while(!l.isEmpty()) {
			 temp = l.peek();
			 l.remove();
			 
			 if(temp.data > key) {
				 if(temp.left == null) {
					 temp.left=new_node;
					 break;
				 }else {
					 l.add(temp.left);
				 }
			 }else if(key > temp.data) {
				 if(temp.right == null) {
					 temp.right = new_node;
					 break;
				 }else {
					 l.add(temp.right);
				 }
			 }
		}
	}
	
	public ArrayList<Integer> treeToList(ArrayList<Integer> list,Node root){
		if(root == null) {
			return list;
		}
		treeToList(list,root.left);
		list.add(root.data);
		treeToList(list,root.right);
		
		return list;
	}
	
	public void isPresent(int s, ArrayList<Integer> arr) {//find pair of node whos sum is eual to given number
		int start=0;
		int end = arr.size()-1;
		
		while(start < end) {
			if((arr.get(start) + arr.get(end)) == s) {
				System.out.println("1st = " + arr.get(start) +" 2nd = "+arr.get(end));
				return;
			}
			else if((arr.get(start) + arr.get(end)) > s) {
				end--;
			}else if((arr.get(start) + arr.get(end)) < s) {
				start++;
			}
		}
		System.out.println("No such pair");
	}
	
	public static void main(String[] args) {
		Tree t = new Tree();
		
		t.insert(1, t.root);
		t.insert(2, t.root);
		t.insert(3, t.root);
		t.insert(4, t.root);
		t.insert(5, t.root);
		
		t.printInorder(t.root);
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		
		//t.isPresent(7,t.treeToList(a,t.root));
		
		System.out.println("");
		Tree t1 = new Tree();
		t1.insertBST(8, t1.root);
		t1.insertBST(3, t1.root);
		t1.insertBST(10, t1.root);
		t1.insertBST(6, t1.root);
		t1.insertBST(1, t1.root);
		t.insertBST(14, t1.root);
		System.out.println(t.treeToList(a,t1.root));
		t1.isPresent(11,t.treeToList(a,t1.root));
		t1.printInorder(t1.root);
	}*/
	
	static class Node{
		int data;
		Node left,right;
		
		public Node(int data){
			this.data = data;
			left = null;
			right = null;
		}	
	}
	
	static Node root;
	
	public static void main(String[] args){
		/*insert(2);
		insert(3);
		insert(4);
		insert(5);
		
		printInorder(root);
		System.out.println();
		printPostorder(root);
		System.out.println();
		printPreorder(root);*/
		String  a = "test";
		int length = a.length();
		char[] b = a.toCharArray();
		b.length;
		String r = a.substring(length/2,(length/2)+1);
		System.out.println(r);
	}
	
	public static void insert(int data){
		Node new_node = new Node(data);
		
		if(root == null){
			root = new_node;
			return;
		}
		Node curr = root,temp;
		LinkedList<Node> a = new LinkedList<Node>();
		a.add(curr);		
		while(!a.isEmpty()){
			temp = a.remove();
			
			if(temp.left == null){
				temp.left = new_node;
				return;
			}
			a.add(temp.left);
			if(temp.right == null){
				temp.right = new_node;
				return;
			}
			a.add(temp.right);
		}
	}

	public static void insertBST(int data){
		
		if(data == root.data){
			return;
		}
			
		Node new_node = new Node(data);

		if(root == null){
			root = new_node;
			return;	
		}
		
		Node curr = root;
		
		while(curr != null){
			if(curr.data > data){
				if(curr.left == null){
					curr.left = new_node;
					return;
				}
				curr = curr.left;
			}else if(curr.data < data){
				if(curr.right == null){
					curr.right = new_node;
					return;
				}
				curr = curr.right;
			}
		}
	}

	public static void printInorder(Node curr){
		
		if(curr == null){
			return;
		}	
		
		printInorder(curr.left);
		System.out.print(curr.data + " ");
		printInorder(curr.right);
	
	}
	
	public static void printPostorder(Node curr){
		
		if(curr == null){
			return;
		}	
		
		printPostorder(curr.left);
		printPostorder(curr.right);
		System.out.print(curr.data + " ");
	
	}

	public static void printPreorder(Node curr){
		
		if(curr == null){
			return;
		}	
		
		System.out.print(curr.data + " ");
		printPreorder(curr.left);
		printPreorder(curr.right);
	
	}

}
