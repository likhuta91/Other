package algorithm.task;

/*
 * Текущее показание электронных часов: т ч (0 ≤ т ≤ 23) п мин (0 ≤ n ≤ 59) k с (0≤ k ≤ 59). 
 * Какое время будут показывать часы через р ч q мин r с?
*/

public class Work_6_1_2_25 {

	public static void main(String[] args) {
		/* текущее время */
		int hour = 6;
		int min = 7;
		int sec = 45;
		/* добавляемое время */
		int h = 36;
		int m = 55;
		int s = 346;

		System.out.println("Текущее время " + hour + ":" + min + ":" + sec);

		sec = sec + s;
		while (sec >= 60) {
			sec = sec - 60;
			min = min + 1;
		}
		min = min + m;
		while (min >= 60) {
			min = min - 60;
			hour = hour + 1;
		}
		hour = hour + h;
		while (hour >= 24) {
			hour = hour - 24;
		}

		System.out.println("Будущее время " + hour + ":" + min + ":" + sec);
	}
}
