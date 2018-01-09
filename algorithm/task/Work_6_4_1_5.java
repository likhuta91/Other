package algorithm.task;

/*У гусей и кроликов вместе 64 лапы. 
 * Сколько может быть кроликов и гусей (указать все сочетания)?
 */

public class Work_6_4_1_5 {
	public static void main(String[] args) {
		int sum_foot = 64;
		int rabbit = 0;
		int duck = 0;

		int rab_foot = 4;
		int duck_foot = 2;
		int v = 0;
		while (v <= sum_foot) {
			
			if (((sum_foot - (duck_foot * duck)) % rab_foot) == 0) {
				rabbit = (sum_foot - duck * duck_foot) / rab_foot;
				System.out.println("Гусей = " + duck + " Кроликов = " + rabbit);
			} 
			duck += 1;
			v = duck * duck_foot;
		}
	}
}