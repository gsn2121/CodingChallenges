package hackerearth;

import java.util.*;

//////////////////QUESTIONS/////////////////////////

/*
You are given a string S. Count the number of occurrences of all the digits in the string S.

Input:
First line contains string S.

Output:
For each digit starting from 0 to 9, print the count of their occurrences in the string S. So, print

lines, each line containing 2 space separated integers. First integer i and second integer count of occurrence of i. See sample output for clarification.

Constraints:

SAMPLE INPUT

77150

SAMPLE OUTPUT

0 1
1 1
2 0
3 0
4 0
5 1
6 0
7 2
8 0
9 0
*/

public class CountOccurences {

	public static void main(String[] args) {
		/*
		 * Sample code to perform I/O: Use either of these methods for input
		 * 
		 * //BufferedReader BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); String name = br.readLine(); // Reading input
		 * from STDIN int n = Integer.parseInt( num); System.out.println("Hi, " + name +
		 * "."); // Writing output to STDOUT
		 * 
		 * //Scanner Scanner s = new Scanner(System.in); String name = s.nextLine(); //
		 * Reading input from STDIN System.out.println("Hi, " + name + "."); // Writing
		 * output to STDOUT
		 * 
		 */

		// Write your code here
		Scanner s = new Scanner(System.in);
		String num = s.next();
		int size = num.length();
		int[] a = new int[size];
		for (int j = 0; j < size; j++) {

			a[j] = Integer.parseInt(Character.toString(num.charAt(j)));
		}
		for (int i = 0; i <= 9; i++) {
			int sum = 0;
			for (int j = 0; j < a.length; j++) {
				if (i == a[j])
					sum++;
			}
			// for(int j =0 ; j < num.length() ; j++)
			// {
			// char c = num.charAt(j);
			// char a = Character.forDigit(i, 10);
			// if( c == a)
			// {
			// sum++;
			// }
			// // System.out.println(a);
			// }
			System.out.println(i + " " + sum);
			sum = 0;
		}

	}

}
