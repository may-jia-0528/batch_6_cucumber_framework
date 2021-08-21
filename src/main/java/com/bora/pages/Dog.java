package com.bora.pages;

public class Dog {
	
	private String name;
	private String breed;
	private String color;
	
	public Dog(String name, String breed, String color) {
		this.name = name;
		this.breed = breed;
		this.color = color;
	}
	
	public void printDogInfo() {
		System.out.println("Name: " + name + " breed: " + breed + " color: " + color);
	}

}
