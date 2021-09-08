package stack;

import java.util.Stack;

public class Test {
	static Stack<Integer> a = new Stack<Integer>();

	public static void main(String[] args){
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println(a);
		reverse();
		System.out.println(a);
	}

	public static void reverse(){
		if(a.isEmpty()){
			return;
		}
		int x;
			x = a.pop();
			reverse();
			insertAtLast(x);
		
	}

	public static void insertAtLast(int x){
		if(a.isEmpty()){
			a.push(x);
			return;
		}
		
		int num = a.pop();
			insertAtLast(x);
			a.push(num);
	}
	/*
	
	Stack<Integer> st = new Stack<>();

	public static void main(String args[]) {
		
		Test t = new Test();
		t.st.push(1);
		t.st.push(2);
		t.st.push(3);
		t.st.push(4);
		t.st.push(5);
		t.st.push(6);
		t.reverse();
		System.out.println(t.st);
		
	}
	 public void insert_at_bottom(int x)
    {
  
        if(st.isEmpty())
            st.push(x);
  
        else
        {
              
            // All items are held in Function
            // Call Stack until we reach end
            // of the stack. When the stack becomes
            // empty, the st.size() becomes 0, the
            // above if part is executed and 
            // the item is inserted at the bottom
            int a = st.peek();
            st.pop();
            insert_at_bottom(x);
  
            // push allthe items held 
            // in Function Call Stack
            // once the item is inserted 
            // at the bottom
            st.push(a);
        }
    }
      
    // Below is the function that 
    // reverses the given stack using
    // insert_at_bottom()
    public void reverse()
    {
        if(st.size() > 0)
        {
              
            // Hold all items in Function
            // Call Stack until we
            // reach end of the stack 
            int x = st.peek();
            st.pop();
            reverse();
              
            // Insert all the items held 
            // in Function Call Stack
            // one by one from the bottom
            // to top. Every item is
            // inserted at the bottom 
            insert_at_bottom(x);
        }
    }
	
	/*public void reverse() {
		if(st.isEmpty()) {
			return ;
		}
		int a = st.pop();
		reverse();
		st.push(a);
	}*/
}
