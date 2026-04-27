package com.kopo.kangseo.java_0427;

import java.util.Arrays;
import java.util.Comparator;

public class SortingEx3 {

	public static void main(String[] args) {
		Integer[] myArr = { 5, 3, 20, 1, 0, 100 };

		Arrays.sort(myArr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}

		});

		System.out.println(Arrays.toString(myArr));

	}

}