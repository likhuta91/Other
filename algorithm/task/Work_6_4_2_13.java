package algorithm.task;

public class Work_6_4_2_13 {

	public static void main(String[] args) {

		int n = 4; // Заданное число N

		int sum = 0;
		int s;

		for (int i = 1; i <= n; i++) {
			s = i;
			for (int j = i; j < 2 * i; j++) {
				s = s * (j + 1);
			}
			sum += s;
		}

		System.out.println("S = " + sum);

	}

}

