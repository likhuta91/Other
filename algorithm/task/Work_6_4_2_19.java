package algorithm.task;

public class Work_6_4_2_19 {

	public static void main(String[] args) {
		int n = 40; // Порядковый номер числа Фибоначчи
		int f_last = 1;
		int f_last_last = 1;
		int f_now = f_last + f_last_last;

		for (int i = 2; i <= n; i++) {
			f_now = f_last + f_last_last;
			f_last_last = f_last;
			f_last = f_now;
		}

		System.out.println("Fn = " + f_now);
	}

}
