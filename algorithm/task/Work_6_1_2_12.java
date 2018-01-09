package algorithm.task;

/*
 * Треугольник задан величинами своих углов и радиусом 
 * описанной окружности. Найти стороны треугольника.
 */

public class Work_6_1_2_12 {
	public static final double PI = 3.141592653589793238462643383279;

	public static void main(String[] args) {

		// Заданные величины углов
		double a;
		double b;
		double c;
		a = 90;
		b = 30;
		c = 60;
		
		// Заданный радиус описанной окружности
		double r;
		r = 10;

		// Искомые стороны треугольника
		double x;
		double y;
		double z;

		x = 2 * r * Math.sin(a * PI / 180);
		y = 2 * r * Math.sin(b * PI / 180);
		z = 2 * r * Math.sin(c * PI / 180);

		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}
}