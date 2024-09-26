package practisequestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Hasmap_ListJuggle_1 {

	public static void main(String[] args) {

		Map<String, List<Integer>> mymap = new HashMap<String, List<Integer>>();

		List<Integer> mylist1 = new ArrayList<>();
		mylist1.add(800);
		mylist1.add(222);
		mylist1.add(80);

		List<Integer> mylist2 = new ArrayList<>();
		mylist2.add(456);
		mylist2.add(900);
		mylist2.add(1600);
		mylist2.add(3200);

		mymap.put("Anil", mylist1);
		mymap.put("Navya", mylist2);

		for (Entry<String, List<Integer>> mymapper : mymap.entrySet()) {

			List<Integer> List_keys = mymapper.getValue();

			for (int i = 0; i < List_keys.size(); i++) {

				if (List_keys.get(i) % 8 == 0) {

					System.out.println("Print key where element is there :" + mymapper.getKey() + "====="
							+ "postion of element is in  :" + i);

				}

			}

		}

	}

}
