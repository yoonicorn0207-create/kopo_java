package com.kopo.kangseo.java_0407;

import java.util.Arrays;

public class arrayExample {

	public static void main(String[] args) {

		// 1. 값으로 초기화 (선언과 동시에 값 할당)
		int[] num = { 21, 11, 6, 13, 11, 7 };
		String[] weekDay = { "월", "화", "수", "목", "금", "토", "일" };

		for (int i = 0; i < num.length; i++) {

		}
		System.out.println(Arrays.toString(num));
		System.out.println("");
		for (int i = 0; i < weekDay.length; i++) {
			System.out.print(weekDay[i]);
		}
		System.out.println("");

		Arrays.sort(num); // 오름차순
		System.out.println(Arrays.toString(num));

		// 2. new 키워드로 크기 지정 (기본값으로 초기화)
		int[] arr = new int[5]; // 0으로 초기화됨
		String[] str = new String[7]; // null로 초기화됨

		// 2차원 배열

	}// MAIN

}// CLASS
