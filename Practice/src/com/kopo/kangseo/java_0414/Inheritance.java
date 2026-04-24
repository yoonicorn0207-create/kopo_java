package com.kopo.kangseo.java_0414;

class MyBeeper {
	
	private int myBeeper;
	public int getMyBeeper() {
		return myBeeper;
	}
	public void setMyBeeper(int myBeeper) {
		this.myBeeper = myBeeper;
	}
	
	void call() {
		System.out.println("kBeep...");
	}
}

class MyPhone extends MyBeeper {
	@Override
	void call() {
		super.call();
		System.out.println("Calling...");
		this.phonebook();
	}

	void phonebook() {
		System.out.println("sPhoneBook...");

	}
}

class MySmartPhone extends MyPhone {
	void browseWeb() {
		System.out.println("nSurfing...");
	}
}//CLASS

public class Inheritance {

	public static void main(String[] args) {
		MySmartPhone myPhone = new MySmartPhone();
		// Inherited from Phone
		myPhone.call();
		// Defined in SmartPhone
		myPhone.browseWeb();
	}

}//CLASS