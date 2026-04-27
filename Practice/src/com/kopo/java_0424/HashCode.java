package com.kopo.java_0424;

import java.util.Objects;

import com.kopo.kangseo_0421.ready;

class User {
	String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User(String id) {
		super();
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			System.out.println("this : " + this);
			System.out.println("o : " + o);
			System.out.println("this == o");
			return true;
		}

		if (o instanceof User) {
			System.out.println("o : " + o);
			System.out.println("o instanceof User");
			return false;
		}

		User user = (User) o;
		return Objects.equals(id, user.id);

	}

}// @Override

class Admin {
	private String id;

	public Admin(String id) {
		super();
		this.id = id;
	}

}// ADMIN

public class HashCode {

	public static void main(String[] args) {

		User a = new User("hfds123");
		User b = new User("knis123");
		Admin c = new Admin("KCIA123");
		User d = new User("USER");

		System.out.println(b.equals(b));

	}// main

}// CLASS
