package algorithm.task;

/*Найти сумму членов арифметической прогрессии, 
 * если известны ее первый член, 
 * знаменатель и число членов прогрессии.
 */

public class Work_6_1_2_20 {

	public static void main(String[] args) {
		double now; // Первый (текущий) член арифметической прогрессии
		double quantity; // Количество членов
		double den; // Знаменатель
		double sum; 

		now = 1;
		quantity = 4;
		den = 3;
		sum = now;

		for (int i = 1; i < quantity; i++) {
			now += den;
			sum = sum + now;
		}
		while (quantity != 0) {
			quantity -= 1;
		}

		System.out.println("Результат=" + sum);
		
	}

}
