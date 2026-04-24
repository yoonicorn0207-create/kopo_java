import java.util.Scanner;

public class Score {

	public static void main(String[] args) {

		// 입력도구 준비
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번쨰 숫자 : ");
		int first_num = sc.nextInt();
		System.out.println("첫번쨰 숫자 : ");
		int second_num = sc.nextInt();

		System.out.println("덧셈 : " + (first_num + second_num));
		System.out.println("나눗셈 : " + (double) (first_num / second_num));

		// 계산기 기능
		System.out.println("국어 점수를 입력하세요");
		int kor = sc.nextInt();

		System.out.println("수학 점수를 입력하세요");
		int math = sc.nextInt();

		System.out.println("영어 점수를 입력하세요");
		int eng = sc.nextInt();

		// 평균하가기
		double total_avg = (double) (kor + math + eng) / 3;
		System.out.println("3과목 전체평균 : " + total_avg);
		System.out.printf("3과목 전체평균 : %.2f ", total_avg);

	}// main

}// CLASS
