package algorithmProblems;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
	static Scanner inp=new Scanner(System.in);
	static boolean status;
	public static void anagramDetection(String str1,String str2) {
		if(str1.length()!=str2.length())
			status=false;
		char[] arrayString1=str1.toCharArray();
		char[] arrayString2=str2.toCharArray();
		Arrays.sort(arrayString2);
		Arrays.sort(arrayString1);
		status=Arrays.equals(arrayString1, arrayString2);
		if(status) {
			System.out.println("ANagram");
		}
		else {
			System.out.println("Not Alagram");
		}
		
	}
	
	public static void main(String[] args) {
	System.out.println("Enter String Number 1:");
	String str1=inp.next();
	System.out.println("Enter String Number 2:");
	String str2=inp.next();
	anagramDetection(str1, str2);
	
	
}
}
