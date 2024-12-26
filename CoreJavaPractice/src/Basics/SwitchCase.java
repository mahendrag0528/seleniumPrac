package Basics;

import java.util.Scanner;

//print 1 to 5 with name
public class SwitchCase {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		
		switch(d) {
		case 1: System.out.println("one");
		break;
		case 2: System.out.println("two");
		break;
		case 3: System.out.println("three");
		break;
		case 4: System.out.println("four");
		break;
		case 5: System.out.println("five");
		break;
		default:System.out.println("number not in 1 to 5");
		}
	}
}
