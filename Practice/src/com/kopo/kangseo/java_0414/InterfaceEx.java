package com.kopo.kangseo.java_0414;

interface Payment {
	void pay(int amt); // 추상 메소드 (구현 없음)
}

class Card implements Payment {
	@Override
	public void pay(int amt) {
		System.out.println("Card Pay: " + amt);
	}
}

class Cash implements Payment {
	@Override
	public void pay(int amt) {
		System.out.println("Cash Pay: " + amt);
	}
}

class NaverPay implements Payment {
	@Override
	public void pay(int amt) {
		System.out.println("Naver Pay: " + amt);
	}
}

class Service {
	// 구체적인 클래스(Card)에 의존하지 않음
	private final Payment p;

	// 생성자 주입 (Constructor Injection)
	public Service(Payment p) {
		this.p = p;
	}

	void run() {
		p.pay(50);
	}

}

public class InterfaceEx {
	// 파라미터로 인터페이스 타입을 받아 어떤 구현체든 처리 가능 (다형성)
	static void checkout(Payment p, int amount) {
		p.pay(amount);
	}

	public static void main(String[] args) {
//		checkout(new Card(), 100);
//		checkout(new Cash(), 200);
//		checkout(new NaverPay(), 300);
		// 1. 의존성 객체 생성
		Payment card = new Card();
		// 2. 주입 (Injection)
		Service s = new Service(card);
		s.run();

		// 1. 의존성 객체 생성
		Payment cash = new Cash();
		// 2. 주입 (Injection)
		Service s2 = new Service(cash);
		s2.run();

		// 1. 의존성 객체 생성
		Payment naverPay = new NaverPay();
		// 2. 주입 (Injection)
		Service s3 = new Service(naverPay);
		s3.run();
	}
}