package com.rvr.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class PalindromeCheck {
	public static boolean isPalindrome(String x) {
		String reverse = new StringBuilder(x).reverse().toString();
		if(x.equalsIgnoreCase(reverse)) return true;
		return false;
	}
	
	public static ArrayList<String> checkPalindromes(ArrayList<String> list) {
		return list.stream().filter(x -> PalindromeCheck.isPalindrome(x)).collect(Collectors.toCollection(ArrayList::new));
	}
	
	public static void main(String []args) {
Scanner scan = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		System.out.print("Enter no. of strings: ");
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			String x = scan.next();
			list.add(x);
		}
		
		System.out.println(PalindromeCheck.checkPalindromes(list));
		scan.close();
	}
}
