package sorting;
import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		int num, i, d, temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of integers to sort");
		num = in.nextInt();
		int array[] = new int[num];
		System.out.println("Enter " + num + " integers");
		for (i = 0; i < num; i++) 
		      array[i] = in.nextInt();
		for (i = 0; i < ( num - 1 ); i++) {
			for (d = 0; d < num - i - 1; d++) {
				if (array[d] > array[d+1]) 
				/* For descending order use < */ {
					temp       = array[d];
					array[d]   = array[d+1];
					array[d+1] = temp;
				}
			}
		}
		System.out.println("Sorted list of numbers");
		for (i = 0; i < num; i++) 
		      System.out.println(array[i]);
	}
		

	}


