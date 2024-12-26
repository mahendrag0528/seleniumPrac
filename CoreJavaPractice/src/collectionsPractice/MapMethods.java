package collectionsPractice;

import java.util.*;

public class MapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map=new HashMap<>();
		map.put(0, 2);
		map.put(4, 7);
		map.put(3, 2);
		map.put(2, 7);
		
		System.out.println(map);
		
		//add duplicate keys
		
		map.put(0, 6); //override the values
		System.out.println(map);
		
		//add same key with value 
		map.put(0, 6); //no error
		System.out.println(map);
		
		for(int i:map.keySet()) {
			System.out.print("key : "+i);
			System.out.println(" -> value : "+map.get(i));
		}
		//contains key in map or not
		boolean keyInMap=map.containsKey(5);
		System.out.println("Key 5 in map : "+ keyInMap);
		//contains value in map or not
		boolean ValueINMap=map.containsValue(6);
		System.out.println("Value 6 in map : "+ValueINMap);
	}

}
