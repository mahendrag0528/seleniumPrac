package collectionsPractice;

import java.util.*;
public class ListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		//add at index
		list1.add(2,22);
		//print list
		System.out.println(list1);
		
		List<Integer> list2=new ArrayList<>();
		list2.add(3);
		list2.add(0,4);
		
		System.out.println(list2);
		
		//append list2 to list1
		list2.addAll(list1);
		//print list2
		System.out.println(list2);
		
		//check 4 is in list2
		if(list2.contains(4)) {
			System.out.println("4 is in list2");
		}
		else {
			System.out.println("4 is not in list2");
		}
		//clear the list
		list2.clear();
		System.out.println(list2);
		
		//get value at 3 index in list1
		System.out.println("3 index value in list1 "+list1.get(3));
	}

}
