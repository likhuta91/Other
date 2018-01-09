package algorithm.task;

import java.util.Scanner;

/*Написать программу, которая по паролю будет определять
уровень доступа сотрудника к секретной информации в базе данных.
Доступ к базе имеют только шесть человек,
разбитых на три группы по степени доступа.
Они имеют следующие пароли:
9583, 1747 — доступны модули баз А, В, С;
3331, 7922 — доступны модули баз В, С;
9455, 8997 — доступен модуль базы С.*/

public class Work_6_2_B_21 {

	private final static int[] A_base_pass = { 9583, 1747 };
	private final static int[] B_base_pass = { 9583, 1747, 3331, 7922 };
	private final static int[] C_base_pass = { 9583, 1747, 3331, 7922, 9455, 8997 };

	public static void main(String[] args) {

		int pass = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите пароль");
		if (sc.hasNextInt()) {
			pass = sc.nextInt();
		}

		for (int a : A_base_pass) {
			if (pass == a) {
				System.out.println("Доступ к модулю базы А разрешен");
			}
		}
		for (int a : B_base_pass) {
			if (pass == a) {
				System.out.println("Доступ к модулю базы B разрешен");
			}
		}
		for (int a : C_base_pass) {
			if (pass == a) {
				System.out.println("Доступ к модулю базы C разрешен");
			}
		}

	}
	

}

