package algorithm.task;

/*Составить программу перевода натурального числа 
 * из десятичной системы счисления в двоичную.
 */

public class Work_6_5_C_3 {

	public static void main(String[] args) {
		int n = 36; // Натуральное число
		System.out.println("Программный перевод " + Integer.toString(n, 2));
		String n_binary = ""; // Двоичное представление натурального числа
		while (true) {
			if (n % 2 == 1) {
				n_binary += 1;
				n = (n - 1) / 2;
			} else {
				n_binary += 0;
				n = n / 2;
			}
			if (n == 0)
				break;
		}

		StringBuilder builder = new StringBuilder(n_binary);
		builder.reverse();
		n_binary = builder.toString();

		System.out.println("Перевод вручную " + n_binary);

	}

}
