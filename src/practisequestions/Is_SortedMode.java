package practisequestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Is_SortedMode {

	public static boolean isSortedAscending(int[] arr) {

		int temp = 0;
		boolean issorted=true;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] > arr[i + 1]) {

				temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;
				issorted=false;

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