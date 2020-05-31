package com.company.guessinggame;

public class GuessGame {
	//Три экземпляра для трёх обьектов Player;
	Player p1;
	Player p2;
	Player p3;

	public void startGame () {
		//создаём три обьекта Player и присваиваем их трём переменным экземпляра.
		p1 = new Player ();
		p2 = new Player ();
		p3 = new Player ();

		//обьявляем три переменные для хранения вариантов каждого игрока.
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		//обьявляем три переменные булевские для хранения правильности или не правильности ответов игроков
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		int targetNumber = (int) (Math.random () * 10);
		System.out.println ("Я загадываю число от 0 до 9...");

		while (true) {
			System.out.println ("Число которое нужно угадать, - " + targetNumber);

			//вызываем метод guess для кажого игрока (просим ввести число)
			p1.guess ();
			p2.guess ();
			p3.guess ();

			//Извлекаем варианты для каждого игрока
			guessp1 = p1.number;
			System.out.println ("Первый игрок думает, что это " + guessp1);
			guessp2 = p2.number;
			System.out.println ("Первый игрок думает, что это " + guessp2);
			guessp3 = p3.number;
			System.out.println ("Первый игрок думает, что это " + guessp3);

			if (guessp1 == targetNumber) {
				p1isRight = true;
			}

			if (guessp2 == targetNumber) {
				p2isRight = true;
			}

			if (guessp3 == targetNumber) {
				p3isRight = true;
			}

			if (p1isRight || p2isRight || p3isRight) {
				System.out.println ("У нас есть победитель!");
				System.out.println ("Первый игрок угадал ? " + p1isRight);
				System.out.println ("Второй игрок угадал ? " + p2isRight);
				System.out.println ("Третий игрок угадал ? " + p3isRight);
				System.out.println ("Конец игры.");
				break; //Игра окончена так что прекратить цикл while.
			} else {
				//условие верхнего ифа не сработало
				System.out.println ("Игроки должны попробовать ещё раз.");
			}//Конец цикла иф елсе
		}//конец цикла вайл
	}//конец метода
}//конец класса
