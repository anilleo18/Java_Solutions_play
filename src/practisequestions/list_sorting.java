package practisequestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class list_sorting {

	private static List<Integer> mylist = new ArrayList<>();
	private static int temp;
	protected static int otter;

	public static void sort_mist(List<Integer> mylist_sort) {

		// sorting take place here

		for (int i = 0; i < mylist.size(); i++) {

			for (int j = i + 1; j < mylist.size(); j++) {

				if (mylist.get(j) < mylist.get(i)) {

					System.out.println(mylist.get(i) + "---" + mylist.get(j));
					temp = mylist.get(j);
					mylist.set(j, mylist.get(i));
					mylist.set(i, temp);

				}

			}

		}

	}

	public static void main(String[] args) {

		mylist.add(10);
		mylist.add(2);
		mylist.add(5);
		mylist.add(9);
		mylist.add(18);

		sort_mist(mylist);
		
		List <Integer> sigma=mylist.stream().sorted((i,j)->i.compareTo(j)).collect(Collectors.toList());
		
		System.out.println(sigma);

		System.out.println(mylist);

	}

}
