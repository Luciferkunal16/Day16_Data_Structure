package algorithmProblems;

import java.util.Scanner;

public class bubbleSort {

	static Scanner inp = new Scanner(System.in);

	static	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	/* Prints the array */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		System.out.println("Enter the size of array");
		int size = inp.nextInt();

		System.out.println("Enter the Elements in array ");
		int[] arrayInt = new int[size];
		for (int i = 0; i < size; i++) {
			int item = inp.nextInt();
			arrayInt[i] = item;
		}
		bubbleSort(arrayInt);
		printArray(arrayInt);
	}
}
