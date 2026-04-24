package com.kopo.kangseo.java_0407;

class Beeper {
	public Beeper() {
		System.out.println("Beeper 호출됨");
	} // 생성자 (생략가능)

	String beeper_num = "123-123-123";

	void beep() {
		System.out.println("Beep...");
	}
}// Beeper



class Phone extends Beeper {

	public Phone() {
		System.out.println("Phone 호출됨");
	} // 생성자

	String number = "010-9999-9999";

	void call() {
		System.out.println("Calling...");
		System.out.println("Beep NUM : " + super.beeper_num); // super는 부모클래스
	}
}// Phone






class SmartPhone extends Phone { // SmartPhone의 부모는 Phone

	SmartPhone() {
		System.out.println("SmartPhone 호출됨");
	} // 생성자

	SmartPhone(String str) {
		System.out.println("SmartPhone 호출됨" + str);
	} // 오버로딩 1번쨰

	private String number = "010-1234-1234";

	void browseWeb() {
		System.out.println("Surfing..." + this.number); // private String number
		System.out.println("Surfing..." + super.number); // super는 부모클래스
	}
	
	@Override
	void call() {
		System.out.println("오버라이드@@@@@@@@@@@@@@@@@@@@@@");
	} //오버라이딩 (자식클래스가 부모클래스의 함수를 재정의)
	
}// SmartPhone

class PC {
	void powerOn() {
		System.out.println("PC Power On");

	}
}// PC

//class TabletPC extends PC, SmartPhone {
//	void powerOn() {
//		System.out.println("PC Power On");
//		
//	}
//}

public class InheritanceTest {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone(); //같은 이름의 메서드를  여러개정의 (단 매개변수가 달라야함): 오버로딩
//		SmartPhone sp = new SmartPhone("GLAXY 26"); //같은 이름의 메서드를  여러개정의 (단 매개변수가 달라야함): 오버로딩
		sp.beep();

		sp.call();

		sp.browseWeb();

	}

}// InheritanceTest
