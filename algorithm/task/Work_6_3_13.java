package algorithm.task;

import java.util.Scanner;

/*Написать программу, которая бы по введенному номеру единицы измерения
(1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр) 
и длине отрезка L выдавала бы соответствующее значение длины отрезка в метрах.*/

public class Work_6_3_13 {

	public static void main(String[] args) {
		double x = 0;
		int number = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Введите номер единицы измерения: \n1 — дециметр\n2 — километр\n3 — метр\n4 — миллиметр\n5 — сантиметр");
		do {
			if (sc.hasNextInt()) {
				number = sc.nextInt();
			}
			sc.nextLine();
		} while (number < 1 || number > 5);

		System.out.println("Введите длину отрезка ");
		do {
			if (sc.hasNextDouble()) {
				x = sc.nextDouble();
			}
			sc.nextLine();
		} while (x == 0);

		if (number != 0) {
			switch (number) {
			case 1:
				x = x / 10;
				break;
			case 2:
				x = x * 1000;
				break;
			case 3:
				break;
			case 4:
				x = x / 1000;
				break;
			case 5:
				x = x / 100;
			}
			System.out.println(x + " м");
		}

	}

}
