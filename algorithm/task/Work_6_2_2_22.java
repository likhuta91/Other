package algorithm.task;

/*Вычисление значений функций*/

public class Work_6_2_2_22 {

	public static void main(String[] args) {
		double x = 4; // Переменная
		Double result = null;

		if (x > 1.1) {
			result = 9 - x;
		} else if (x < -1.1) {
			result = Math.sin(3 * x) / (Math.pow(x, 4) + 1);
		}

		if (result != null) {
			System.out.println("Результат = " + result);
		}

	}

}
