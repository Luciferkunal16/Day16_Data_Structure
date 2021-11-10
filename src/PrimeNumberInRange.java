package algorithmProblems;

import java.util.Scanner;

public class PrimeNumberInRange {
	static int count;
static Scanner inp=new Scanner(System.in);
public static void primeNumber(int start,int end) {
	int flag;
	
	 for (int i = start; i <= end; i++) {
		 
         // Skip 0 and 1 as they are
         // neither prime nor composite
         if (i == 1 || i == 0)
             continue;

         // flag variable to tell
         // if i is prime or not
         flag = 1;

         for (int j = 2; j <= i / 2; ++j) {
             if (i % j == 0) {
                 flag = 0;
                 break;
             }
         }

         // flag = 1 means i is prime
         // and flag = 0 means i is not prime
         if (flag == 1)
             System.out.println(i);
     }
}
public static void main(String[] args) {
	System.out.println("Enter the range");
	System.out.println("from:");
	int from=inp.nextInt();
	System.out.println("till:");
	int till=inp.nextInt();
	primeNumber(from, till);
	
}
}
