package de.uk.java;

/* Wir können unendlich tief vererben.
 * Boy erbt von Male, erbt von Human, erbt von Object (Java Standard)
 */
public class Boy extends Male {

	public Boy(String name, int age, int height) {
		super(name, age, height);
	}

}

