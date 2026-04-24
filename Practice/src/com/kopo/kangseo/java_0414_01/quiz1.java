package com.kopo.kangseo.java_0414_01;

import java.util.Arrays;

public class quiz1 {

	public static void main(String[] args) {

		// 조건1
		
		// 1. 초기 배열선언
		int[] arr = { 1, 3, 3, 4, 5, 2, 6, 7, 6, 7 };
		int[] arrNew = new int[7];
		int count = 0;
		System.out.print("초기 배열 : ");
		
		// 2. 콘솔 출력요구사항
		for (int sol = 0; sol < arr.length; sol++) {
			System.out.print(arr[sol] + ",");
		} // for
		System.out.println();

		System.out.print("새로운 배열의 길이 : "+arrNew.length); // 7
		System.out.println();

		// 3. 새로운 배열 사용(새로운 배열생성)
		for (int i = 0; i < arr.length; i++) {
			int target = arr[i];
//			System.out.println("target : "+ target);
//			System.out.println("count : "+ count);
			int j=0;
//			System.out.println("j : "+ j);
			for (j = 0; j < count; j++) {
				if (arrNew[j] == target) {
					System.out.println(target + " -> 중복이라 제거됨");
					break;
				} // for2
			} // for1

			if (j == count) {
//				System.out.println("if j : "+ j);
//				System.out.println("if count : "+ j);
				if (count < arrNew.length) {
					arrNew[count] = target;
					count++;
					System.out.println(target + " -> 추가됨");
				} else {
					System.out.println(target + "중복이라 제거됨");
				}
			} // if(j==count)

		} // for( 3. 새로운 배열 사용(새로운 배열생성))
		// 4.새로운 배열출력
		for (int f = 0; f < arrNew.length; f++) {
			System.out.print(arrNew[f] + ", ");
		}
		System.out.println("");

//--------------------------------------------------------------------------------------------------------------------------------

	
		// 조건 2
		// 내림차순정렬
		int temp = 0;
		for (int i = 0; i < arrNew.length; i++) {

			for (int j = 0; j < arrNew.length; j++) {
				System.out.println("-----출력------");
				System.out.println("arrNew[i] : " + arrNew[i]);
				System.out.println("arrNew[j] : " + arrNew[j]);

				if (arrNew[i] > arrNew[j]) {
					temp = arrNew[i];
					arrNew[i] = arrNew[j];
					arrNew[j] = temp;
				} // if

			} // for(j)

		} // for(i)

		System.out.println("최종배열 : " + Arrays.toString(arrNew));
	}// main

}// CLASS
