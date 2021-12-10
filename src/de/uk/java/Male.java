package de.uk.java;

public class Male extends Human {

	public Male(String name, int age, int height) {
		super(name, age, height);
	}

	/* Wie neue Instanzvariablen sind neue Methoden in Kinderklassen nur für Kinderklassen gültig
	 */
	public void peeStandingUp() {
		System.out.println("Wow");
	}

}
