package com.rvr.streams;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringFilter {
	public static ArrayList<String> filterStrings(ArrayList<String> list) {
		return list.stream().filter(x -> x.contains("a") && x.length() == 3).collect(Collectors.toCollection(ArrayList::new));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		System.out.print("Enter no. of strings: ");
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			String x = scan.next();
			list.add(x);
		}
		
		System.out.println(StringFilter.filterStrings(list));
		scan.close();
	}
}
