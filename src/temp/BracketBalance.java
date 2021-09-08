package temp;

import java.util.List;
import java.util.Stack;

public class BracketBalance {
	

	public static void main(String[] args){
		String a = "}{{{{[[(())]]}}}}";

		System.out.println(verifyBracket(a));
	}

	public static Boolean verifyBracket(String a){
		
		Stack<Character> stack = new Stack<Character>();
		char b,c;
		for(int i = 0; i < a.length(); i++){
			b = a.charAt(i);
			if(b == '{' || b == '[' || b == '('){
				stack.push(b);
				continue;
			}
			if(stack.isEmpty()){
				return false;
			}
			
			switch(b){
				case '}':
					c = stack.pop();
					if(c != '{'){
						return false;
					}
					break;
				case ']':
					c = stack.pop();
					if(c != '['){
						return false;
					}
					break;
				case ')':
					c = stack.pop();
					if(c != '('){
						return false;
					}
					break;
			}
			
		}
		return stack.isEmpty();
	}
	
	/*public static void main(String[] args){
		String a = "(((s{c{b[a]}})))";

		System.out.println(brackets(a));
	}

	public static Boolean brackets(String a){
		char b,c;
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < a.length(); i++){
			b = a.charAt(i);
			if(b == '(' || b == '{' || b == '['){
				stack.push(b);
			}else{
				
				switch(b){
				case ')':
						c = stack.pop();
						if(c != '('){
							return false;
						}
						break;
				case '}':
						c = stack.pop();
						if(c != '{'){
							return false;
						}
						break;
				case ']':
						c = stack.pop();
						if(c != '['){
							return false;
						}
						break;
				}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args){
		String a = "{{{{(([]))}}}}";
		
		System.out.println(verifyBracket(a));
	}

	public static Boolean verifyBracket(String inp){
		Stack<Character> stack = new Stack<Character>();
		char a,b;
		for(int i = 0; i < inp.length(); i++){
			a = inp.charAt(i);
			if(a == '{' || a == '(' || a == '['){
				stack.push(a);
				continue;
			}
			
			if(stack.isEmpty()) {
				return false;  
			}
					
			switch(a){
				case '}':
					b = stack.pop();
					if(b != '{'){
						return false;
					}
					break;
				case ')':
					b = stack.pop();
					if(b != '('){
						return false;
					}
					break;
				case ']':
					b = stack.pop();
					if(b != '['){
						return false;
					}
					break;				
			}
		}
		return stack.isEmpty();
	}*/


}
