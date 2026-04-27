package com.kopo.kangseo.java_0427;

class MyRunnable2 implements Runnable {

	@Override
	public void run() {
		System.out.println("run");
		
	}
	
}

public class ThreadEx3 {

	public static void main(String[] args) {
	
		MyRunnable2 mr = new MyRunnable2();
		Thread t = new Thread(mr);
		t.start();

		
		Thread t2 = new Thread(() -> {
			System.out.println("람다 쓰레드 실행!");
			});
		t2.start(); // 쓰레드 시작

	}

}