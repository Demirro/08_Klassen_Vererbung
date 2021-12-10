package de.uk.java;

public abstract class Human {
	
	private String name;
	private int age;
	private int height;
	
	public Human(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public void walk() {
		System.out.println(this.name + " walked a few meters.");
	}

	public void run() {
		
	}
	
	public String talk() {
		return null;
	}
	
	public String getFormattedName() {
		return name + "tralala";
	}
}
