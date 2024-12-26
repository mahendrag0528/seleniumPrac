package Basics;
import java.util.*;
public class StringMath {

	public static void main(String[] args) {
		String a="Hello";
		String b="World";
		
		//Concatenation method
		String c=a+" "+b;
		System.out.println(c);
		
		//char At
		System.out.println(c.charAt(6));
		
		double x=8.675;
		System.out.println(Math.abs(x));
		int y=4;
		System.out.println(Math.sqrt(y));
		
		//string methods
		System.out.println(a.contains("o"));
		System.out.println(b.compareTo(a));
		System.out.println(a.endsWith("0"));
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		
	}
}
