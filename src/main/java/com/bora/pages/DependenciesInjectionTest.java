package com.bora.pages;

public class DependenciesInjectionTest {
	public static void main(String[] args) {
		
		String name = "Shadow";
		String breed = "German Shepherd";
		String color = "Black";
		
		Dog dog =  new Dog(name, breed, color);
		dog.printDogInfo();
		
		
	}

}
