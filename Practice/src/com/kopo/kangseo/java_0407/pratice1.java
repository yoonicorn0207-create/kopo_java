package com.kopo.kangseo.java_0407;


public class pratice1 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;

		}
		System.out.println(sum);

		System.out.println(myFunc(1));

		// 5! 재귀로 구현 54321
		System.out.println(myFunc2(5));

		// 피보나치 수열
		System.out.println(myFunc3(1));

	}// main

	// 재귀함수
	public static int myFunc(int i) {

		if (i == 100)
			return 100;

		return i + myFunc(++i); // 재귀함수 (나자신의 함수를 호출)
	}

	public static int myFunc2(int i) {

		if (i == 1)
			return 1;
		System.out.println(i);

		return i * myFunc2(--i);
	} // 재귀함수 문제 2 (5! = 5*4*3*2*1)

	public static int myFunc3(int i) {

		if (i == 13)
			return 0;
		System.out.println(i);
		return i + myFunc3(++i);
	}// 재귀함수 문제3 (피보나치수열)

}// CLASS
