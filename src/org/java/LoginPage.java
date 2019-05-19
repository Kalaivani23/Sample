package org.java;

public class LoginPage {
	public void add() {
		System.out.println("Add");
	}

	public void sub() {
		System.out.println("Sub");
	}

	public static void main(String[] args) {
		LoginPage l = new LoginPage();
		l.add();
		l.sub();
		l.add();
	}
}
