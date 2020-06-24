package com.luis.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// {{41, 77, 74, 22, 44}, {12}}
		ArrayList<ArrayList<Integer>> lista = new ArrayList<ArrayList<Integer>>();
		Integer size = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < size; i++) {
			lista.add(new ArrayList<Integer>());
			String value = sc.nextLine();
			String[] values = value.split(" ");
			int size2 = Integer.parseInt(values[0]);
			for (int j = 1; j <= size2; j++) {
				int intValue = Integer.parseInt(values[j]);
				lista.get(i).add(intValue);
			}
		}
		Integer totalquery = Integer.parseInt(sc.nextLine());
		for (int k = 0; k < totalquery; k++) {
			String query = sc.nextLine();
			String[] querys = query.split(" ");
			int x = Integer.parseInt(querys[0]);
			int y = Integer.parseInt(querys[1]);
			try {
				System.out.println(lista.get(x-1).get(y-1));
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
		}

		System.out.println(lista);
		sc.close();
	}

}
