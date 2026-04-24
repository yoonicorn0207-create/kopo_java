import java.util.Arrays;

public class Example_array {

	public static void main(String[] args) {

		// 배열선언
		// 타입[] 변수명 = new타입[크기]
		int[] arr3 = new int[5];
		// 타입[] 변수명 = {1,2,3}
		int[] arr4 = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };

		// 1. 선언 + 생성 (공간만 확보)
		// int형 공간 5개 (0으로 자동 초기화)
		int[] arr1 = new int[5];
		
		// 2. 선언 + 초기화 (값 지정)
		int[] arr2 = {30, 25, 10, 100, 10, 20, 30, 40, 50};
		
		
		int temp = 0;
		for(int i=0; i<arr2.length-1; i++) {
			
			for(int j=i+1; j<arr2.length; j++) {
			System.out.println("----");
			System.out.println("i : "+arr2[i]);
			System.out.println("j : "+arr2[j]);
				if(arr2[i] < arr2[j]) {
					temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
					
				}
			}
		
		}//for
		
		System.out.println(Arrays.toString(arr2));
		for(int i = 0; i<arr2.length; i++) {
		}
		
		
		// 3. 값 접근 및 변경
//		System.out.println(arr2[0]); // 10
//		arr2[0] = 100;
//		System.out.println(arr2[0]); // 100
		
		// 4. 배열 길이 (length)
		// 인덱스 범위: 0 ~ (length - 1)
//		System.out.println(arr2.length); // 5
		// 주의: 인덱스 범위 초과시 예외 발생!
//		 arr2[5] -> ArrayIndexOutOfBoundsException

		
		
		
		
	}// main

}// CLASS
