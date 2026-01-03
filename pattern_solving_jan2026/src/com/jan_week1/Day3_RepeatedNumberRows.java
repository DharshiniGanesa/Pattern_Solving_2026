package com.jan_week1;
import java.util.Scanner;

public class Day3_RepeatedNumberRows {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(" "+i);
			}
			System.out.println("");
		}
		scan.close();

	}

}
