package collectionsPractice;

import java.util.*;

public class SetMethods {
	
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		//adding elements to set
		
		set.add(3);
		set.add(5);
		
		System.out.println(set);
		System.out.println(set.size());
		
		//add duplicates to set and size print
		set.add(5);

		System.out.println(set);
		System.out.println(set.size());
		
		//check value 5 is in set
		if(set.contains(5)) {
			System.out.println("contains in set");
		}
		else {
			System.out.println("Not in set");
		}
		
		//cannot access through index in set
		
		//convert set to list
		List<Integer> setToList=new ArrayList<>(set);
		
		//now can access
		System.out.println("value at index 1 :"+setToList.get(1));
	}
}
