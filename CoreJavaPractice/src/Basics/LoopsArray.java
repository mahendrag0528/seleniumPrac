package Basics;

import java.util.Scanner;

public class LoopsArray {

	public static void main(String[] args) {
		
		//Array declaration
		int[] a=new int[8];
		//reading from console using for loop
		Scanner s=new Scanner(System.in);
		for(int i=0;i<8;i++) {
			a[i]=s.nextInt();
		}
		
		//Print using while loop
		int j=0;
		while(j<8) {
			System.out.println("Array value at + "+j+" "+a[j]);
			j++;
		}
	}
}
