package de.uk.java;

public class Application {

	public static void main(String[] args) {
		
		Male adam = new Male("Adam", 30, 180);
		
		Female eva = new Female("Eva", 31, 181, false);
		
		Male max = new Male("Max", 12, 130);
		
		Female laura = new Female("Laura", 25, 170, false);
		
		max.setAge(80);
		
		System.out.println(adam.getName() + " " + adam.getAge() + " " + adam.getHeight());
		System.out.println(eva.getName() + " " + eva.getAge() + " " + eva.getHeight());
		System.out.println(max.getName() + " " + max.getAge() + " " + max.getHeight());
		System.out.println(laura.getName() + " " + laura.isPregnant());
		
		adam.walk();
		eva.walk();
		max.walk();
		max.peeStandingUp();
		
		System.out.println("Eva: " + eva.talk());
		System.out.println("Laura: " + laura.talk());
		System.out.println("Laura: " + laura.getFormattedName());
	}

}
