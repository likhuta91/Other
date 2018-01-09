package algorithm.task;

/*Даны натуральные числа М и N. 
 * Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.
 */

public class Work_6_1_2_31 {
	public static void main(String[] args) {
		int m = 5435;
		int n = 6;
		String res = String.valueOf((double) m / n);
		
		int indexDot = res.indexOf(".");

		System.out.println("Младшая цифра целой части = " + Integer.parseInt(res.substring(indexDot - 1, indexDot)));
		System.out.println("Старшая цифра дробной части = " + Integer.parseInt(res.substring(indexDot + 1, indexDot + 2)));
	}
}
