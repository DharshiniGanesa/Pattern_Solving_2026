package com.jan_week1;
import java.util.Scanner;
public class Day1_LeftTrianglePattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		
		for(int i =0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		scan.close();
	}

}

