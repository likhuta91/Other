package algorithm.task;

/* Дана сторона равностороннего треугольника. 
 * Найти площадь этого треугольника, его высоту, 
 * радиусы вписанной и описанной окружностей.
 */

public class Work_6_1_2_9 {

	public static void main(String[] args) {
		double x;
		double area;
		double h;
		double rinside;
		double routside;

		x = 9;

		area = Math.pow((x * 1.5) * (x * 0.5) * (x * 0.5) * (x * 0.5), 0.5);
		h = area * 2 / x;
		rinside = area * 2 / (3 * x);
		routside = Math.pow(Math.pow(rinside, 2) + Math.pow(x / 2, 2), 0.5);

		System.out.println("Площадь=" + area);
		System.out.println("Высота=" + h);
		System.out.println("Радиус вписанной окружности=" + rinside);
		System.out.println("Радиус описанной окружности=" + routside);
	}
}