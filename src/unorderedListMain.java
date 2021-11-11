package unorderedList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class unorderedListMain {
	static Scanner inp = new Scanner(System.in);
	static LinkedList list = new LinkedList();

	public static void writeIntoFile() throws FileNotFoundException {
		PrintWriter out = new PrintWriter("D:\\bridgelabz\\newWordList.txt"); // Step 2

        
        out.println(list);   
       

        // Close the file.
        out.close();
	}
	public static void search(String key) {
		if(list.search(key)>0) {
			int position=list.search(key);
			System.out.println("Element found and position "+position+" popping it now");
			list.deleteNode(list.search(key));
			try {
				writeIntoFile();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Element not found Inserting it in List");
			list.append(key);
		}
	}

	public static void main(String[] args) throws Exception {
		
		File file = new File("D:\\bridgelabz\\Java\\wordlist.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		// Declaring a string variable
		String st;
		// Consition holds true till
		// there is character in a string
		while ((st = br.readLine()) != null)

			// Print the string
			list.append(st);
		System.out.println("Enter the word you want to search");
		String word = inp.next();
	
		search(word);
		

	}

}
