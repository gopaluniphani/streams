package com.rvr.streams;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {
	public float findAverage(ArrayList<Integer> list) {
		float sum = list.stream().mapToInt(x -> x).sum();
		return sum / list.size();
	}
	
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.print("Enter no. of elements: ");
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			int x = scan.nextInt();
			list.add(x);
		}
		System.out.println("Average: " + new Average().findAverage(list));
	}
}
