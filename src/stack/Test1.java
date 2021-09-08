package stack;

import java.util.Scanner;
import java.util.Stack;

public class Test1 {
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            System.out.println(check(input));
		}
		
	}
	
	public static boolean check(String a){
        if(a == null){
            return false;
        }
        
        char ch[] = a.toCharArray();
        int i = 0;
        char b;
        while(i < ch.length){
            
            if(ch[i] == ('(') || ch[i] == ('{') || ch[i] == ('[')){
                stack.push(ch[i]);
                i++;
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            b = (char)stack.pop();
            switch(ch[i]){
                case '}':
                            
                            if(b == '{'){
                                break;
                            }
                            return false;
                            
                case ')':
                            
                            if(b == '('){
                                break;
                            }
                             return false;
                case ']':
                            
                            if(b == '['){
                                break;
                            }
                             return false;
                            
                
            }
            i++;
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
    /*
    public static boolean check(String a){
        if(a == null){
            return false;
        }
        
        char ch[] = a.toCharArray();
        int i = 0;
        char b;
        while(i < ch.length){
            
            if(ch[i] == ('(') || ch[i] == ('{') || ch[i] == ('[')){
                stack.push(ch[i]);
                i++;
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            b = (char)stack.pop();
            switch(ch[i]){
                case '}':
                            
                            if(b == '{'){
                                break;
                            }
                            return false;
                            
                case ')':
                            
                            if(b == '('){
                                break;
                            }
                             return false;
                case ']':
                            
                            if(b == '['){
                                break;
                            }
                             return false;
                            
                
            }
            i++;
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }*/
}
