package algorithm.task;

/*Даны два действительных числа х и у. 
 *Вычислить их сумму, разность, произведение и частное
 */

public class Work_6_1_2_7 {

	public static void main(String[] args) {
		double x;
		double y;
		double different;
		double amount;
		double composition;
		double privat;

		x = 8;
		y = 7.76;

		different = Math.abs(x - y);
		amount = x + y;
		composition = x * y;
		privat = x / y;

		System.out.println("Разница=" + different);
		System.out.println("Сумма=" + amount);
		System.out.println("Произведение=" + composition);
		System.out.println("Частное=" + privat);
	}
}