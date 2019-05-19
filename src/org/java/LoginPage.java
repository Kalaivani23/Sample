package org.java;

public class LoginPage {
	public void add() {
		System.out.println("Add");
	}

	public void sub() {
		System.out.println("Sub");
	}
	
	public void multi() {
		System.out.println("Multi");
	}
	
	public void mod() {
		System.out.println("Mod");
		System.out.println("Kalaivani");
	}
	public static void main(String[] args) {
		LoginPage l = new LoginPage();
		l.add();
		l.sub();
		l.add();
		l.mod();
	}
}
