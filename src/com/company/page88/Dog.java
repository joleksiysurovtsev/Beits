package com.company.page88;

public class Dog {
	String name;

	public static void main (String[] args) {
		Dog dog1 = new Dog();
		dog1.dark();
		dog1.name = "Bart";

		Dog[] myDogs = new Dog[3];

		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;

		myDogs[0].name = "Frad";
		myDogs[1].name = "Джордж";


		System.out.println("Name last dog - " + myDogs[2].name);

		int x = 0;
		while (x < myDogs.length) {
			myDogs[x].dark();
			x = x + 1;
		}


	}

	public void dark () {
		System.out.println(name + "сказал Гав!");
	}

	public void eat () {
	}

	public void chaseCat () {
	}
}
