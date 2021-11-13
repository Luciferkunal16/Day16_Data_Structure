package parentesis;

import java.util.Scanner;

public class BalncedPranthesis {

	public static void main(String[] args) {
Scanner inp=new Scanner(System.in);
		/*
		 * Exception handling
		 * */
		try {
			
			Stack<Character> stk=new Stack<Character>();
			System.out.println("Equation: ");
			String str=inp.next();
			
			int len=str.length();
			System.out.println(len);
			
			for(int i=0;i<len;i++) {
				char ch=str.charAt(i);
				if(ch=='(') {
					/*
					 * calling stack push method
					 * */
					stk.push(ch);
					
				}
				else if(ch==')') {
					/*
					 * calling stack push method
					 * */
					stk.pop();
					
				}
			}
			
			//Check for Arithmatic expression is balanceds or not
			if(stk.isEmpty()==true) {
				System.out.println("Arithmatic expression is Balanced.  ");
			}
			else {
				System.out.println("Arithmatic expression is Not Balanced. ");
			}
		
		}catch(Exception e) {System.out.println("Message "+e);}
	}

}
