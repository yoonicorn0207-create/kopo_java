package com.kopo.kangseo.java_0427;

class MyRunnable5 implements Runnable {

	@Override
	public void run() {
		System.out.println("<<<<<<<<< Before Sleep >>>>>>>>>>>"); // 10 mSec * 10 -> 100mSec
		try {
			// 1000 밀리초(3초) 동안 현재 쓰레드 일시 정지
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("3초 후 다시 실행됨");

	}

}// MyRunnable5

public class ThreadEx5 {

	public static void main(String[] args) throws InterruptedException {

		MyRunnable5 mr = new MyRunnable5();
		Thread t = new Thread(mr);
		t.start();
		t.join();

		Thread t2 = new Thread(() -> {
			System.out.println("람다 쓰레드 실행!");
		});
		t2.start(); // 쓰레드 시작

	}

}