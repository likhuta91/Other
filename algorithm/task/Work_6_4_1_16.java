package algorithm.task;

import java.util.Scanner;

/*Составить программу, которая печатает 
 * таблицу умножения и сложения натуральных чисел
 * в шестнадцатеричной системе счисления.*/

public class Work_6_4_1_16 {

	public static void main(String[] args) {

		String[][] tabl_mult = new String[4][4]; // Таблица умножения
		String[][] tabl_addi = new String[4][4]; // Таблица сложения

		createTabl(tabl_mult, 1);
		createTabl(tabl_addi, 2);

		System.out.println("Таблица умножения");
		printTable(tabl_mult);
		System.out.println("Таблица сложения");
		printTable(tabl_addi);

	}

	public static void printTable(String[][] tabl) {
		for (int i = 0; i < tabl.length; i++) {
			for (int j = 0; j < tabl[i].length; j++) {
				if (i == 0 || j == 0) {
					System.out.printf(" %4s  ", tabl[i][j]);
				} else {
					System.out.printf("[%4s ]", tabl[i][j]);
				}
			}
			System.out.println("");
		}
	}

	public static void createTabl(String[][] tabl, int k) {
		int mult = 1;
		int addi = 2;
		for (int i = 0; i < tabl.length; i++) {
			for (int j = 0; j < tabl[i].length; j++) {
				if (i == 0) {
					if ((i == 0) && (j == 0)) {
						tabl[i][j] = " ";
					} else {
						tabl[i][j] = String.valueOf(j);
					}
				} else if (j == 0) {
					tabl[i][j] = String.valueOf(i);
				} else {
					switch (k) {
					case 1:
						tabl[i][j] = Integer.toHexString(i * j);
					case 2:
						tabl[i][j] = Integer.toHexString(i + j);
					}

				}
			}
		}
	}

}
