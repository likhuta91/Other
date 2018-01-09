package algorithm.task;
/*
 * Дано действительное число х. Не пользуясь никакими другими арифметическими операциями,
 * кроме умножения, сложения и вычитания, вычислить за минимальное число операций
 */

public class Work_6_1_2_15 {

	public static void main(String[] args) {
		double x = 2;		
		double result = 6 + x * (x * (x * (2 * x - 3) + 4) - 5);		
		System.out.println("Результат=" + result);
	}
}
