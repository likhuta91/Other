package algorithm.task;

/* Имеется серия измерений элементов треугольника. Группы элементов пронумерованы. 
 * В серии в произвольном порядке могут встречаться такие группы элементов треугольника:
1) основание и высота;
2) две стороны и угол между ними (угол задан в радианах);
3) три стороны.
Разработать программу, которая запрашивает номер группы элементов, 
вводит соответствующие элементы и вычисляет площадь треугольника. 
Вычисления прекратить, если в качестве номера группы введен 0.
*/

import java.util.Scanner;

public class Work_6_4_1_1 {
	public static final double PI = 3.141592653589793238462643383279;

	public static void main(String[] args) {
		int numgroup;
		double area = 0; // площадь

		System.out.println("Введите номер группы параметров");
		numgroup = enterNumberGroup();

		while (numgroup > 3 || numgroup < 0) {
			System.out.println("Номер введен неверно. Повторите ввод номера");
			numgroup = enterNumberGroup();
		}

		switch (numgroup) {
		case 0:
			break;
		case 1:
			System.out.println("Введи основание треугольника");
			double l = enterParam();
			System.out.println("Введи высоту треугольника");
			double h = enterParam();
			area = l * h / 2;
			break;
		case 2:
			System.out.println("Введи первую сторону треугольника");
			double l1 = enterParam();
			System.out.println("Введи вторую сторону треугольника");
			double l2 = enterParam();
			double rad = 0; // Угол в радианах
			do {
				System.out.println("Введи допустимый угол между ними в радианах");
				rad = enterParam();
			} while (rad >= PI);
			area = l1 * l2 * Math.sin(rad) / 2;
			break;
		case 3:
			System.out.println("Введи первую сторону треугольника");
			double m1 = enterParam();
			System.out.println("Введи вторую сторону треугольника");
			double m2 = enterParam();
			double m3 = 0;
			do {
				System.out.println("Введи допустимое значение третьей стороны треугольника");
				m3 = enterParam();
			} while (m3 < 0 || m3 >= m1 + m2);
			double per = (m1 + m2 + m3) / 2;
			area = Math.pow(per * (per - m1) * (per - m2) * (per - m3), 0.5);
		}

		if (area != 0) {
			System.out.println("Площадь = " + area);
		}
		System.out.println("Выполнение завершено");
	}

	public static int enterNumberGroup() {
		Scanner sc = new Scanner(System.in);
		int x = -1;
		if (sc.hasNextInt()) {
			x = sc.nextInt();
		} else {
			System.out.println("Введен текст, повтори ввод положительных цифр!");
		}
		return x;
	}

	public static double enterParam() {
		Scanner sc = new Scanner(System.in);
		double x = 0;
		while (x <= 0) {
			if (sc.hasNextDouble()) {
				x = sc.nextDouble();
				if (x <= 0) {
					System.out.println("Введен 0 или отрицательное число, повтори ввод положительных цифр!");
				}
			} else {
				sc.nextLine();
				System.out.println("Введен текст или отрицательное число, повтори ввод положительных цифр!");
			}
		}		
		return x;
	}

}
