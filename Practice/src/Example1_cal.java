/*오후) 연산*/

import java.util.Scanner; //Scanner사용시 선언

public class Example1_cal {

	public static void main(String[] args) {

		int num = 10;
		System.out.println("증가 전 num 값 : " + num);
		num = num + 5;
		System.out.println("증가 후 num 값 : " + num);

		num += 5;
		System.out.println("증가 후 num 값 : " + num);

		num -= 5;
		System.out.println("빼기 후 num 값 : " + num);

		num *= 5;
		System.out.println("곱하기 후 num 값 : " + num);

		num /= 5;
		System.out.println("나누기 후 num 값 : " + num);

		num %= 5;
		System.out.println("num 나누기 나머지 값 : " + num);

		// 증감연산자
		num++; // 전치연산
		System.out.println("증감 num++ : " + num);

		// 전치연산
		int i = 1;
		System.out.println("전치연산 i++ : " + i++); // 1
		System.out.println("전치연산후 : " + i); // 2

		// 후치연산
		i = 1;
		System.out.println("후치연산 ++i : " + ++i); // 2
		System.out.println("후치연산후 : " + i); // 2

		// @입력받기 (사용자의 입력을 받아서 그대로 프린트)
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력하세요.");
//		int num_scan = sc.nextInt();
//		
//		System.out.printf("입력값 숫자1 : " + num_scan );
//		System.out.printf("입력값 숫자2 : %10d\t", num_scan );// [\t] : 들여쓰기
//		System.out.printf("입력값 숫자3 : %d\n", num_scan ); // [\n] : 개행
//
//		System.out.printf("num is %20d", 10); //[%d] : 정수를 찍겠다 [%10d] : 10자리 뒤에 정수를 찍겠다 

		float f = 11.13333333f;
		double d = 1.1;
		double e = 1.2;

//		if(d+e == 2.3) {
//			System.out.println("ha");
//		} else {
//			System.out.println("-_-");
//			
//		} //위험한 코드 double은 오차가 있기때문에

		System.out.printf("float: %5.2f\n", f);
		System.out.printf("double: %.20f\n", d);
		System.out.println(d + e);

		// 실습
		int a = 10;
		int b = 3;

		// 정수끼리 나누면? (소숫점 버림)
		System.out.println(a / b);
		// 형변환해서 나누면? (실수결과)
		System.out.println((double) a / b);

		int a2 = 10;
		int b2 = 20;
		System.out.println("------------------");
		double avg = (double) (a2 + b2) / 2;
		System.out.println("평균을 실수로 출력 : " + avg);

		// 자바에서 new는 객체화 한다 = instance 화 한다= 실체화 한다 = 메모리에 올린다
//		
//		 Scanner sc1 = new Scanner(System.in); 
//		 System.out.println("실수 2개를 입력 : ");
//		float num1 = sc1.nextFloat();		
//		float num2 = sc1.nextFloat();		
//		System.out.println("실수2개의 합 : " + (num1+num2));
//		

		// 실습 원의 넓의 구하기

		Scanner sc2 = new Scanner(System.in);

		System.out.println("반지름의 넓이를 구하세요. (1이상 100이하)");
		double r = sc2.nextDouble();

		double area = Math.PI;

		if (r > 100 || r <= 0) {
			System.out.println("계산불가");

		} else {
			System.out.println("원의 넓이 : " + area * r * r);

		} // if

		//

	}// main

}// CLASS
