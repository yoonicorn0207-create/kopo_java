package com.kopo.kangseo.java_0427;

/* 추상클래스 영역 : unit → 공통적인 기능 구현 */

//1. 추상클래스(부모클래스)

abstract class airUnit {

	private String unitName;

	public airUnit(String unit) {
		this.unitName = unit;
	}

// 공통 메서드

	public void introduce() {
		System.out.println("이 Unit은 " + unitName + "입니다");
	}

	// 부모클래스 추상메서드
	abstract void flyMove();

}// airUnit

//-------------------------------------------------------------------------------------------------------------------

/* Interfaced영역 : unit특성에 따른 부가적 기능 구현 */

interface Attackable {
	void attack();
}// 공격

interface Transportable {
	void transportUnit();
}// 수송

interface Searchable {
	void searchStelth();
}// 정찰

interface SpecialSkills {
	void specialSkill();
}// 특수기술

//-------------------------------------------------------------------------------------------------------------------

//2. 자식클래스

class BattleCruiser extends airUnit implements Attackable, SpecialSkills {
	public BattleCruiser(String unit) {
		super(unit);
	}

	@Override // Override : 상속관계에 있는 클래스들 사이에서 부모클래스에서 정의한 매서드를 자식클래스에서 같은 매서드 이름으로 다시 정의하여 사용
	void flyMove() {
		System.out.println("차원 도약하며 비행합니다.");
	}// flyMove -> 부모클래서 추상메서드 구체화

	@Override
	public void attack() {
		System.out.println("레이저로 공격합니다. (공격력 : 300)");
	}// Interface -> 인터페이스 메서드 구체화

	@Override
	public void specialSkill() {
		System.out.println("특수기술 : 야마토포를 쏩니다");
	}

}// BattleCruiser

class DropShip extends airUnit implements Transportable {
	public DropShip(String unit) {
		super(unit);
	}

	@Override
	void flyMove() {
		System.out.println("비행항해 속도 마하 1/s 으로 비행합니다.");
	}// flyMove -> 부모클래스 추상메서드 구체화

	@Override
	public void transportUnit() {
		System.out.println("유닛을 수송합니다.");
	}// Interface -> 인터페이스 메서드 구체화

}// DropShip

class ScienceVessel extends airUnit implements Searchable, SpecialSkills {

	@Override
	void flyMove() {
		System.out.println("비행항해 속도 마하 1.5/s로 비행합니다.");
	}

	public ScienceVessel(String unit) {
		super(unit);
	}

	@Override
	public void searchStelth() {
		System.out.println("숨어있는 Unit이 보입니다.");
	}

	@Override
	public void specialSkill() {
		System.out.println("특수기술 : 방사능 구름을 형성합니다.");
		System.out.println("방어막을 형성합니다.");
		System.out.println("EMP탄을 발사합니다.");
	}

}//

/* 다형성 구현 */

public class Starcraft {

	public static void main(String[] args) {

		airUnit[] units = new airUnit[3];

		units[0] = new BattleCruiser("배틑크루저");
		units[1] = new DropShip("드랍십");
		units[2] = new ScienceVessel("과학선");

// units[0].introduce();

// units[0].flyMove();

// 결과물 출력

		for (int i = 0; i < units.length; i++) {

// 배열에서 객체를 꺼내 임시 변수에 저장

			airUnit u = units[i];

			System.out.println("");

			// 1. 공통 기능 실행
			u.introduce();
			u.flyMove();

/* 인터페이스 영역(유닛별 기능) */

			// 2. 공격 기능이 붙어있는지 확인 후 실행
			if (u instanceof Attackable) {
				Attackable attacker = (Attackable) u; // (Attackable)로 형변환을 해줘야 attack() 메서드가 보입니다
				attacker.attack();
			} // if

			// 3. 수송 기능이 붙어있는지 확인 후 실행
			if (u instanceof Transportable) {
				((Transportable) u).transportUnit();
			} // if

			// 4. 정찰 기능이 붙어있는지 확인
			if (u instanceof Searchable) {
				((Searchable) u).searchStelth();
			}

			// 5. 특수 기술이 붙어있는지 확인
			if (u instanceof SpecialSkills) {
				((SpecialSkills) u).specialSkill();
			}

		}//FOR(전체결과물 출력)

	}// main

}// CLASS