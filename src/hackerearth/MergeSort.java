package hackerearth;

import java.util.Scanner;
import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int len, sum = 0;

		Scanner sc = new Scanner(System.in);
		len = sc.nextInt();
		int[] array = new int[len];
		for (int i = 0; i < len; i++) {
			array[i] = sc.nextInt();
		}

		Arrays.sort(array);
		int flag = 0;

		for (int i = 0; i < len; i++) {
			if (i == 0) {
			} else {
				int pre = array[i - 1] + 1;
				if (array[i] == Math.abs(pre)) {
					if (flag != 1) {
						sum = pre;
						flag = 1;
					}
					sum += array[i];
				}
			}
		}

		if (sum == 0) {
			System.out.print('1');
		} else {
			System.out.print('0');
		}

		sc.close();
	}
}

// public int[] mergeArrays(int[]arr1,int[]arr2 )
// {
// int arr1_len = 0 , arr2_len;
// arr1_len = arr1.length;
// arr2_len = arr2.length;
// int arr3[] = new int[arr1_len+arr2_len];
//
// int i = 0, j = 0, k = 0;
//
//
// while (i<arr1_len && j <arr2_len)
// {
// if (arr1[i] < arr2[j])
// arr3[k++] = arr1[i++];
// else
// arr3[k++] = arr2[j++];
// }
//
//
// while (i < arr1_len)
// arr3[k++] = arr1[i++];
//
// while (j < arr2_len)
// arr3[k++] = arr2[j++];
//
//
// return arr3;
// }

// int[] arr1 = {-1, 1 ,3, 5, 7 , 9};
// int n1 = arr1.length;
//
// int[] arr2 = {-2,2,3, 4, 5, 6};
// int n2 = arr2.length;
//
// int[] arr3 = new int[n1+n2];
// MergeSort Object1 = new MergeSort();
// arr3 = Object1.mergeArrays(arr1, arr2);
//
// System.out.println("Array after merging");
// for (int i=0; i < n1+n2; i++)
// System.out.print(arr3[i] +*/ " ");
