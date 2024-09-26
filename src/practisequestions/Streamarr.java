package practisequestions;

import java.util.Arrays;

public class Streamarr {

	static int[] arr = { 75, 66, 7, 2, 4, 1, 4, 6, 8 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] newarr = Arrays.stream(arr).boxed().sorted((a, b) -> a.compareTo(b)).mapToInt(Integer::intValue).toArray();

		
		
		int temp=0;
		
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

				}

			}

		}
         System.out.print(Arrays.toString(arr));
	}

}
