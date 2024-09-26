
package practisequestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapper_Exec {

	public static void mapper() {

		List<Integer> mylist = new ArrayList<Integer>();

		mylist.add(3);
		mylist.add(8);
		mylist.add(17);

		mylist.add(8);

		mylist.add(8);

		mylist.add(17);
		mylist.add(21);

		

		Map<Integer, Integer> mymap = new HashMap<Integer, Integer>();

		int count = 0;

		for (int  num : mylist) {

			if (mymap.containsKey(num)) {

				mymap.put(num, mymap.get(num) + 1);
			} else {

				mymap.put(num, count + 1);
			}

			for (Map.Entry<Integer, Integer> mapper : mymap.entrySet()) {

				System.out.println(mapper.getKey() + "======" + mapper.getValue());

			}

		}

	}

	public static void main(String[] args) {

		mapper();

	}

}
