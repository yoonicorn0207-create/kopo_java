package com.smart.yoon;


abstract class Car {

	private String model;

	abstract void drive();

	public Car(String model) {
		this.model = model;
	}

	public void explain() {
		System.out.println("차종 : " + model);
	}

}// CLASS(Car)

interface Electric {
	void charge();
}// interface

/* Sedan, Truck, EletricCar 클래스 */

class Sedan extends Car {

	public Sedan(String model) {
		super(model);
	}

	@Override
	void drive() {
		System.out.println("부드럽게 달린다");

	}

}// Sedan

class Truck extends Car {

	public Truck(String model) {
		super(model);
	}

	@Override
	void drive() {
		System.out.println("짐을 싣고 달린다");

	}

}// Truck

class ElectricCar extends Car implements Electric {

	public ElectricCar(String model) {
		super(model);
	}

	@Override
	public void charge() {
		System.out.println("배터리를 충전한다");

	}

	@Override
	void drive() {
		System.out.println("전기로 달린다.");

	}

}// ElectricCar


public class CarQuiz{
	public static void main(String[] args) {
		Car[] cars = new Car[3];
		cars[0]  = new Sedan("[G90]");
		cars[1]  = new Truck("[포터]");
		cars[2]  = new ElectricCar("[테슬라]");
		
		
		
		for(int i=0; i<cars.length; i++) {
			cars[i].explain();
			cars[i].drive();

			
			/// "i번째 차가 전기를 implement 되니?"
			if(cars[i] instanceof Electric) { 
				((Electric)cars[i]).charge();
			}//if
		}
		
		
		
		
		System.out.println("===========================================");
		
//		if(cars[0] instanceof )
		
		System.out.println(cars[0] instanceof Car); //true
		System.out.println(cars[0] instanceof ElectricCar);//false
		System.out.println(cars[0] instanceof Electric); //false
		
		ElectricCar mycar = new ElectricCar("any car");
		System.out.println(mycar instanceof Car); //true
		System.out.println(mycar instanceof ElectricCar);//true
		System.out.println(mycar instanceof Electric); //true
	}
}//CarQuiz
