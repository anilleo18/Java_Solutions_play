package practisequestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Carowners_Retrival {

	public static void main(String[] args) {
		
		boolean flag =false;

		Map<String, Map<String, String>> Mymap1 = new HashMap<>();

		Map<String, String> mymapper1 = new HashMap<>();

		mymapper1.put("name", "anil@gmail.com");
		

		Map<String, String> mymapper2 = new HashMap<>();

		mymapper2.put("name", "aanya@gmail.com");
		

		Mymap1.put("owner1", mymapper1);

		Mymap1.put("owner2", mymapper2);

		for (Entry<String, Map<String, String>> Map_ele : Mymap1.entrySet()) {
			
		String ele_key=	Map_ele.getKey();
		
		Map<String, String> ele2=Map_ele.getValue();
		
		if(ele2.get("name").equals("anil@gmail.com")) {
			
			flag=true;
			
			System.out.print(ele_key);
			
		}
		
		
			
			
			
			

		}

	}

}
