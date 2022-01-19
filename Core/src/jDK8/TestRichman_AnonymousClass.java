package jDK8;

import interfaces.Richman;

public class TestRichman_AnonymousClass {

	public static void main(String[] args) {
	
		Richman r = new Richman() {//Annonymous inner type class from Richman interface.
			
			@Override
			public void party() {
				System.out.println("Hey lets Party....");
				
			}
			
			@Override
			public void earnmoney() {
				System.out.println("Lets earn money....");
				
			}
			
			@Override
			public void donation() {
				System.out.println("Do donation...");
				
			}
		};r.party();
		r.donation();
		r.earnmoney();
	}
}
