package algorithm.task;

/* Составить алгоритм решения задачи: сколько можно купить быков, коров и телят,
 * платя за быка 10 руб., за корову — 5 руб., а за теленка — 0,5 руб.,
 * если на 100 руб. надо купить 100 голов скота?
 */

public class Work_6_4_1_6 {
	public static void main(String[] args) {
		int cost_b = 10; // Стоимость быка
		int cost_k = 5; //Стоимость коровы
		double cost_t = 0.5; // Стоимость теленка		
		int var = 0; // количество вариантов решений задачи
		int sum_money = 100; // Заданная стоимость всех животных
		int sum_head = 100; // Заданное количество голов всех животных
		double money = 0;
		int head = 0;

		for (int i = 0; i < sum_money / cost_b; i++) {
			for (int j = 0; j < sum_money / cost_k; j++) {
				for (int f = 0; f < sum_money / cost_t; f++) {
					money = i * cost_b + j * cost_k + f * cost_t;
					head = i + j + f;
					if (money == sum_money && head == sum_head) {
						var += 1;
						System.out.println("Быков = " + i + ", коров = " + j + ", телят = " + f);
					}
				}
			}
		}
		if (var == 0) {
			System.out.println("Решения у задачи нет");
		}

	}

}
