package com.kopo.kangseo.java_0427;

class MyRunnableS implements Runnable {

	@Override
	public void run() {
		System.out.println("<<<<<<<<< Before Sleep >>>>>>>>>>>"); // 10 mSec * 10 -> 100mSec
		try {
			// 1000 밀리초(1초) 동안 현재 쓰레드 일시 정지
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("3초 후 다시 실행됨");

	}

}

public class SynchronizedEx {

	static int count;

	static synchronized void increment() {
		count++;
	}

	public static void main(String[] args) throws InterruptedException {

		MyRunnableS mr = new MyRunnableS();
		Thread t = new Thread(mr);
		t.start();
		t.join();

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000000; i++)
				ThreadEx2.increment();
		});
		t2.start(); // 쓰레드 시작

		Thread t3 = new Thread(() -> {
			for (int i = 0; i < 1000000; i++)
				ThreadEx2.increment();
		});
		t3.start(); // 쓰레드 시작

		t2.join();
		t3.join();
		System.out.println(count);

	}

}