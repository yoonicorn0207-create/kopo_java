
public class Comparison {

	public static void main(String[] args) {

		System.out.println(3 != 5 && 1 == 2);

		/*
		 * if(조건문) { 조건문이 True일때 수행 } else { 조건문이 False일때 수행되는 문장 }
		 */

		int a = 10;
		int b = 9;

		if (a >= 10 && b < 0) {
			System.out.println("True");
		} else {
			System.out.println("False");

		} // if

		// swith문

		int dice = 3;
		switch (dice) {
		case 1:
			System.out.println("멍멍");
			break; // 필수! (없으면 break이 걸릴때까지 아래로 찍힘)
		case 2:
			System.out.println("야옹");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("기타");
		}// switch

		// if문으로 만들기
		if (dice == 1) {
			System.out.println("멍멍");

		} else if (dice == 2) {
			System.out.println("야옹");

		} else if (dice == 3) {
			System.out.println("3");

		} else {
			System.out.println("기타");

		} // if - else

	}// main

}// CLASS
