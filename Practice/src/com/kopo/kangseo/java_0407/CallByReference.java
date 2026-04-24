package com.kopo.kangseo.java_0407;

class CallByReference {
	static void change(int[] arr) { //베열의 주소값을 받아서 내부값 변경
		arr[0] = 100; // 내부 값 변경
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };
		System.out.print("배열의 주소값 : "+a);
		
		change(a); //변경된 값을 출
		
		System.out.println(a[0]);
	}

}//CLASS
