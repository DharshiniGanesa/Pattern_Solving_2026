package com.jan_week2;
import java.util.Scanner;
public class Day1_DiamondOfNumbers {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		
		for(int i =0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" "+i);
			}
			System.out.println("");
			
		}
		for(int i =n-1;i>=0;i--){
			for(int j=0;j<i;j++) {
				System.out.print(" "+i);
			}
			System.out.println("");
		}
		
		scan.close();
	}

}
