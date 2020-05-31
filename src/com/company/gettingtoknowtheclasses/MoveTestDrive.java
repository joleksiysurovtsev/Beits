package com.company.gettingtoknowtheclasses;

public class MoveTestDrive {
	public static void main (String[] args) {
		Move one = new Move ();
		one.title = "Как Прогореть на Акциях";
		one.genre = "Трагедия";
		one.rating = -2;
		Move two = new Move ();
		two.title = "Потеряные в Офисе";
		two.genre = "Комедия";
		two.rating = 5;
		two.playIt ();
		Move three = new Move ();
		three.title = "Байт-Клуб";
		three.genre = "Трагедия, но в целом весёлая";
		three.rating = 127;

	}
}
