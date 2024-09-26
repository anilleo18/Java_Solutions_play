package practisequestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Incremental_order {

	public static void array_ascendingorder(int[] arr) throws InvalidArrayException {

		List<Integer> mylist = new ArrayList<Integer>();

		if (arr == null) {
			
			throw new InvalidArrayException("hey this Array is null please check");
		
		}

		for (int num : arr) {

			mylist.add(num);
		}

		List<Integer> mylist_new = mylist.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());

		System.out.println(mylist_new);
	}

	public static void main(String[] args) throws InvalidArrayException {

		int[] arr1 = { 01012010, 01012020, 01012020, 01012023, 01012000 };
		array_ascendingorder(arr1);

	}

}
