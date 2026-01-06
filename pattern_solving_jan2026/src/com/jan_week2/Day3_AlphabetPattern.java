package com.jan_week2;

import java.util.Scanner;

public class Day3_AlphabetPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        char ch = 'A';
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {	
                System.out.print(" " + ch);
                ch++;
            }
            System.out.println();
        }


        scan.close();
	}

}
