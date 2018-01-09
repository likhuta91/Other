package algorithm.task;

/*Даны два числа. Найти среднее арифметическое кубов этих чисел 
 *и среднее геометрическое модулей этих чисел.
 */

public class Work_6_1_2_5 {

	public static void main(String[] args) {
		double x;
		double y;
		double aMean;
		double gMean;

		x = 6;
		y = -9;

		aMean = (Math.pow(x, 3) + Math.pow(y, 3)) / 2;
		gMean = Math.pow(Math.abs(x * y), 0.5);

		System.out.println("Среднее арифметическое=" + aMean);
		System.out.println("Среднее геометрическое=" + gMean);
	}
}