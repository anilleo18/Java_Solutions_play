package practisequestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class practise {

	static int[] arr = { 8, 9, 9, 5, 6, 7, 8, 3, 2, 1 };
	static int count = 0;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> mymap = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			if (mymap.containsKey(key)) {
				mymap.put(key, mymap.get(key) + 1);

			} else {
				mymap.put(key, 0);
			}

		}

		for (Map.Entry<Integer, Integer> myentry : mymap.entrySet()) {

			if(myentry.getValue()>1) {
				
				
				System.out.print(myentry.getKey()+"========="+myentry.getValue());
			}
			
			
			
			
		}

	}

}
