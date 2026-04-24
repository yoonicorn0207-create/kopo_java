package com.kopo.kangseo.java_0407;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// 1. 참조 (Reference)
		int[] a = { 1, 2, 3 };
		int[] b = a; // 주소 복사 (얕은 복사)
		System.out.println("a : "+a); // 10 (a도 바뀜)
//		System.out.println("b : "+b);
		b[0] = 10;
		System.out.println("a[0] : "+a[0]); // 10 (a도 바뀜)

		// 2. 깊은 복사 (Deep Copy)
		int[] c = new int[3];

		// a배열 0번부터 c배열 0번으로 3개 복사
		System.arraycopy(a, 0, c, 0, 3);
		c[0] = 999;
		System.out.println(a[0]); // 10 (a 영향 없음)

		// 3. 정렬 (Sort)
		int[] arr = { 5, 1, 9, 3 };
		Arrays.sort(arr); // [1, 3, 5, 9]
		System.out.println(Arrays.toString(arr));

		// 4.
		int[][] src = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] dest = new int[2][4];

		for (int i = 0; i < src.length; i++) {
			System.arraycopy(src[i], 0, dest[i], 0, src[i].length);
		} // for

		System.out.println(Arrays.deepToString(dest));

		// 5.
		int[][] aa = new int[5][5];
		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa.length; j++) {
				
				if(i == 2 || j==2) {
					
					System.out.print("(" + i + "," + j + ")");
				} else {
					System.out.print("     ");
					
				}

			}
			System.out.println();
		}//for
		

	}// main

}// CLASS