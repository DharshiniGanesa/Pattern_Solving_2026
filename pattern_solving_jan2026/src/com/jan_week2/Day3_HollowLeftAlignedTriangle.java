package com.jan_week2;
import java.util.Scanner;
public class Day3_HollowLeftAlignedTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
              if(i == n || j==1 || j==i) {
            	  System.out.print("*");
              }else {
            	  System.out.print(" ");
              }
            }
            System.out.println();
        }


        scan.close();


	}

}
