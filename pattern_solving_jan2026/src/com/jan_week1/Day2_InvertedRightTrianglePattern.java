package com.jan_week1;
import java.util.Scanner;
public class Day2_InvertedRightTrianglePattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		
		for(int i =n;i>0;i--) {
			for(int k=0;k<n-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		scan.close();
	}

}
