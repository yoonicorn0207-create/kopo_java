
public class for_grammer {

	public static void main(String[] args) {

		/*
		 * for(초기값; 종료조건 ; 증감값){
		 * 
		 * 
		 * }
		 * 
		 */
		int sum1 = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			sum1 += i;
			System.out.println(sum1);
		} // for문

		// 구구단
		for (int dan = 2; dan < 10; dan++) {
			System.out.println("-------" + dan + "단" + "-------");
			
			for (int num = 1; num < 10; num++) {

				System.out.println(dan + " × " + num + " = " + dan * num);
			}//for(연속해서 곱하는 숫자)
			
		} // for(구구단 : 단수)

		/*
		 * while(조건문이 참일 동안) { // 이 문장이 수행됨 }
		 * 
		 */

		int i = 0;
		int sum = 0;

//		while(i<=100) {
//             sum += i;
//             i++;
//		}
//		System.out.println(sum);

//		for(;;) {  // while(true)
//			if(i>100) break;
//			sum += i;
//            i++;
//		}
//		System.out.println(sum);

//		while(true) {  // while(true)
//			if(i>100) break;
//			sum += i;
//            i++;
//		}
//		System.out.println(sum);

		do {
			if (i > 100)
				break;
			sum += i;
			i++;
		} while (true);
		System.out.println(sum);

	}// main

}// CLASS
