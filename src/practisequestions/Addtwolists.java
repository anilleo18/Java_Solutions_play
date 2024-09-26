package practisequestions;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Addtwolists {
	
	
	   public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer>mylist=new ArrayList<Integer>();
		mylist.add(2);
		mylist.add(88);
		
		
		ArrayList<Integer>mylist2=new ArrayList<Integer>();
		mylist2.add(9);
		mylist2.add(3434);
		mylist2.add(992);

		
		ArrayList<Integer>mylist3 = new ArrayList<Integer>();;
		
		for(int ele:mylist) {
			mylist3.add(ele);
		}
		
		for(int ele:mylist2) {
			mylist3.add(ele);
		}
		
		mylist=(ArrayList<Integer>) mylist3.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
		
		System.out.print(mylist);
		

	}

}
