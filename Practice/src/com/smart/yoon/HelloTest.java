package com.smart.yoon;

import com.kopo.yoon.Hello;

class Child extends Hello {
	public void test() {
		System.out.println("");
		System.out.println("=== 상속받은경우 ===");
		publicMethod();
//		defaultMethod();
		protectedMethod();

	}
}//CLASS(Child)

public class HelloTest {

	public static void main(String[] args) {

		Hello yoon = new Hello(); // 다른패키지에 생성
		Hello2 ccy = new Hello2(); // 동일패키지에 생성

		System.out.println("====다른패키지에서 접근====");

		yoon.publicMethod();
//		yoon.privateMethod();
//		yoon.defaultMethod();
//		yoon.protectedMethod();

		System.out.println("");

		System.out.println("====동일 패키지에서 접근====");
		ccy.publicMethod();
		ccy.defaultMethod();
		ccy.protectedMethod();
//		ccy.privateMethod();
		System.out.println("");
		
		
		System.out.println("=== 상속받은경우 ===");
		Child c = new Child();

		c.test();
	}

}// CLASS
