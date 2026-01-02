package com.jan_week1;
import java.util.Scanner;
public class Day2_InvertedLeftTrianglePattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		
		for(int i =n;i>=0;i--){
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		scan.close();
	}

}
