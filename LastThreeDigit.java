package Geekster_Test;

import java.util.Scanner;

public class LastThreeDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int res = n%1000;
		System.out.println("Last three digit of number:" +res);

	}

}
