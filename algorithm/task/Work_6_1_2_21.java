package algorithm.task;

/*
 Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с. 
 */

public class Work_6_1_2_21 {
	public static final double PI = 3.141592653589793238462643383279;

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double alfa;
		double beta;
		double gamma;

		a = 3;
		b = 4;
		c = 5;

		alfa = Math.acos((Math.pow(a, 2) - Math.pow(b, 2) + Math.pow(c, 2)) / (2 * a * c));
		beta = Math.acos((Math.pow(b, 2) - Math.pow(c, 2) + Math.pow(a, 2)) / (2 * b * a));
		gamma = Math.acos((Math.pow(c, 2) - Math.pow(a, 2) + Math.pow(b, 2)) / (2 * b * c));

		System.out.println("alfa = " + alfa + " рад, alfa = " + alfa * 180 / PI);
		System.out.println("beta = " + beta + " рад, beta = " + beta * 180 / PI);
		System.out.println("gamma = " + gamma + " рад, gamma = " + gamma * 180 / PI);
	}

}
