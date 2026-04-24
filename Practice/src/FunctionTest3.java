import java.util.*;
public class FunctionTest3 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자: ");		
//		int n = sc.nextInt(); // 5 입력
//		System.out.print("n : " + n);		
	
	
		
		
		// 사용자 숫자 2개를 입력받아서 4칙연산 결과를 출력하세요
		//사칙연산에 해당하는 함수를 구현하기
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		plus(num1, num2);
		minus(num1, num2);
		mutiple(num1, num2);
		devide(num1, num2);
		
		System.out.println(plus(num1, num2));
		System.out.println(minus(num1, num2));
		System.out.println(mutiple(num1, num2));
		System.out.println(devide(num1, num2));
		
		
		//calculate() 함수 호출
		System.out.println("덧셈 : " + calculate(num1, num2, '+'));
		System.out.println("뺄셈 : " + calculate(num1, num2, '-'));
		System.out.println("곱셈 : " + calculate(num1, num2, '*'));
		System.out.println("나눗셈 : " + calculate(num1, num2, '/'));
		sc.close();
	
	}//main

	public static int plus(int a, int b) {
		return a + b;
	}//plus() 함수
	
	public static int minus(int a, int b) {
		return a - b;
	}//minus() 함수
	
	public static int mutiple(int a, int b) {
		return a * b;
	}//mutiple() 함수
	
	public static double devide (int a, int b) {
		return (double) (a / b);
	}//devide() 함수
	
	
	public static double calculate(int a, int b, char op) {
	    switch(op) {
	        case '+': return a + b;
	        case '-': return a - b;
	        case '*': return a * b;
	        case '/': return (double)a / b;
	        default: 
	            System.out.println("잘못된 연산자");
	            return 0;
	    }//switch
	
	}//calculate()
	
}//CLASS