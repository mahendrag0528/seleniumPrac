package Basics;
//print only even numbers from array..

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			if(a[i]%2 == 0) {
				System.out.println(a[i]+"->"+"even");
			}
			else {
				System.out.println(a[i]+"->"+"odd");
			}
		}
	}

}
