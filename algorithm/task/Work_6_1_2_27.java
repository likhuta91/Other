package algorithm.task;

/*Полторы кошки за полтора часа съедают полторы мышки.
 * Сколько мышек съедят X кошек за Y часов?
 */

public class Work_6_1_2_27 {

	public static void main(String[] args) {
		// Начальные значения мышей, кошек и времени
		double cat = 1.5;
		double time = 1.5;
		double mouse = 1.5;

		// Заданное количество кошек и времени
		double xcat = 3;
		double ytime = 3;

		// Искомое количество мышек
		double resmouse;

		resmouse = (mouse * xcat / cat) * ytime / time;

		System.out.println("Съедено мышей=" + resmouse);
	}
}
