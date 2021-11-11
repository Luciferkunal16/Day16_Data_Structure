package orderedList;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;



public class orderedListMain {
	static LinkedList1 list = new LinkedList1();

	public static void  search(int num) {
		if(list.search(num)>0) {
			int key=list.search(num);
			
			System.out.println("Element found at position "+key +" Poping it");		
			list.deleteNode(key);
			
			
		}
		else {System.out.println("Element not found so insering it");
		list.append(num);
		
			
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner inp=new Scanner(System.in);
		Scanner scanner = new Scanner(new File("D:\\\\bridgelabz\\\\Java\\\\wordlistint.txt"));

		while (scanner.hasNextInt()) {
			list.append(scanner.nextInt());
		}
		
		System.out.println("Enter the Number you want to search");
		int num = inp.nextInt();
		search(num);
		list.display();

	}

}
