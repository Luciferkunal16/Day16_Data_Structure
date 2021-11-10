package algorithmProblems;

import java.util.Scanner;

public class FindMyNumber {
	static Scanner inp = new Scanner(System.in);
	
	
	
	public static void find(int num) {
		int start=0;
		boolean choice;
		int end=(int)Math.pow(num, 2)-1;
		int mid;
		while(start<=end) {
		mid=start+end/2;
		if(mid>num) {
			System.out.println("Your number is between "+start+" and "+mid);
			 choice=inp.nextBoolean();
			 if(choice)
				 end=mid-1;
			 		
			
		}
		else if(mid==num) {
			System.out.println("Your number is "+mid);
			
			
		}else  {
			System.out.println("Your number is between "+mid+" and "+end);
			 choice=inp.nextBoolean();
			 if(choice)
				 System.out.println("mid="+mid);
				 start=mid+1;
		}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the Number you want to find ");
		int num=inp.nextInt();
		find(num);
		
	}
}
