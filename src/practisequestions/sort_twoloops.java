package practisequestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sort_twoloops {

	public static boolean isSortedAscending(int[] arr) {

		int temp = 0;
		boolean issorted = true;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					issorted = false;

					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}

			}

		}
		System.out.println("sorted array is :" + Arrays.toString(arr));

		return issorted;

	}

	public static void main(String[] args) {

		int[] arr = { 14, 6, 13, 212, 32, 56, 66, 99 };

		if (isSortedAscending(arr)) {

			System.out.println("Array is  sorted :");

		} else {

			System.out.println("Array is not  sorted :");

		}

	}

}