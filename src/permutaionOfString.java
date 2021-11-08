package algorithmProblems;

import java.util.Scanner;

public class permutaionOfString {
	private static void recursivePermutation(String subString, String remaining)
    {
        // base case
        if (remaining == null) {
            return;
        }
 
        if (remaining.length() == 0) {
            System.out.println(subString);
        }
 
        for (int i = 0; i < remaining.length(); i++)
        {
            String newCandidate = subString + remaining.charAt(i);
 
            String newRemaining = remaining.substring(0, i) +
                    remaining.substring(i + 1);
 
          recursivePermutation(newCandidate, newRemaining);
        }
    }
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter A String");
		String input = inp.nextLine();
		String candidate="";
		recursivePermutation(candidate, input);
	

	}

}
