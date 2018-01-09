package algorithm.task;

/*Заданы координаты трех вершин треугольника (x1, y1), (х2, y2), (x3, y3). 
 * Найти его периметр и площадь.
 */

public class Work_6_1_2_2 {

	public static void main(String[] args) {
		// Координаты вершин треугольника № 1, 2 и 3
		double x1, y1;
		double x2, y2;
		double x3, y3;

		// Стороны треугольника между вершинами
		double k12, k23, k31;

		// Искомые периметр и площадь треугольника
		double per, area;

		x1 = 3;
		y1 = 6;
		x2 = 1;
		y2 = -1;
		x3 = -5;
		y3 = -3;

		k12 = cathet(x1, y1, x2, y2);
		k23 = cathet(x2, y2, x3, y3);
		k31 = cathet(x3, y3, x1, y1);

		per = k12 + k23 + k31;
		area = Math.pow((per / 2) * ((per / 2) - k12) * ((per / 2) - k23) * ((per / 2) - k31), 0.5);

		System.out.println("Периметр = " + per);
		System.out.println("Площадь = " + area);
	}

	private static double cathet(double x1, double y1, double x2, double y2) {
		return Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
	}
}