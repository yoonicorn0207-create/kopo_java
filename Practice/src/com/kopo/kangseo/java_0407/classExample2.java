package com.kopo.kangseo.java_0407;

/*캡슐화*/

class MyPoint {
	private int x;
	private int y;

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	
}//CLASS




public class classExample2 {

//	int a = 0 ; //static이 없으면 메모리에 안올라가서 사용불가능
	static int a = 0 ;
	
	
	public static void main(String[] args) {
		
		System.out.println(a);
		
		MyPoint mp = new MyPoint();
		mp.setX(3); // private된 변수에 값을 넣어주기
		mp.setY(4); 
		
		mp.getX();// private된 변수에 값 가져오기
		mp.getY();
		
		System.out.println(mp.getX());
		System.out.println(mp.getY());
		mp = null; //가비지 컬렉터가 삭제해줌 (mp라는 이름으로 MyPoint 객체를 가리키지 않겠다)
		
		//static 안에서는 this 사용불가  객체선언후 함수에서는 this사용 가능해서 불러오기
		//this
		classExample2 aaa = new classExample2();
		aaa.test();
		
	}// main

	
	
	
	
	public void test() {
		System.out.println(this.toString()); //this사용가능
		System.out.println(a); 
	}
	
	
}// CLASS