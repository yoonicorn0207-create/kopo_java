public class Hello {
	// 전역변수

	public static void main(String[] args) {
		// 어떤 말을 써도 코드에 영향을 미치지 않음
		System.out.println("Hello World");
		System.out.println("abcd");

		// 지역변수 : 함수안에 선언된 변수
		int age = 100; // 변수 선언(초기화)
		double bcd = 3.14;
		float edf = 3.14f;
		String str = "abc";
		boolean detr = true; // false
		char chr = 'A';
		char chr2 = 0xAC00;
		int a = 10;
		double bol = a;

		double bol2 = 3.14;
		int x = (int) bol2;

		System.out.println("age : " + age);
		System.out.println("double : " + bcd);
		System.out.println("float : " + edf);
		System.out.println("String : " + str);
		System.out.println("boolean : " + detr);
		System.out.println("char : " + chr);
		System.out.println("char2(16진수) : " + chr2);
		System.out.println("double_bol : " + bol); // int -> double
		System.out.println("double_bol2 : " + x); // double -> int (0.14손실)

		//

	}// main

} // CLASS
