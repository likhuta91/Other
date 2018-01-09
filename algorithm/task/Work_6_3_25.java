package algorithm.task;

import java.util.ArrayList;
import java.util.Scanner;

/*Напишите программу, которая читает натуральное число в десятичном представлении,
а на выходе выдает это же число в десятичном представлении и на естественном языке. 
Например,
7 семь
204 двести четыре
52 пятьдесят два*/

public class Work_6_3_25 {

	public static String[][] name = {
			{ "", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одинадцать",
					"двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать",
					"восемнадцать", "девятнадцать" },
			{ "", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семдесят", "восемдесят",
					"девяноста" },
			{ "", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот" },
			{ "", "одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одиннадцать",
					"двеннадцать", "триннадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать",
					"восемнадцать", "девятнадцать" } };

	public static void main(String[] args) {
		ArrayList<Integer> mass;
		int ch = 0;
		String result = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите натуральное число");

		do {
			if (sc.hasNextInt()) {
				ch = sc.nextInt();
			}
			sc.nextLine();
		} while (ch < 1);

		mass = transformation(ch);

		for (int i = mass.size() - 1; i >= 0; i--) {
			result = result + threeValued(mass.get(i), i);
		}

		System.out.println(ch + " " + result);
	}

	// Возвращает трехзначную строку на естественном языке (100-999)
	public static String threeValued(int ch, int i) {
		String result = "";
		if (ch < 100) {
			result = twoValued(ch, i);
		} else {
			result = name[2][(ch - ch % 100) / 100] + " " + twoValued(ch % 100, i);
		}
		return result;
	}

	// Возвращает двухзначную строку на естественном языке (20-99)
	public static String twoValued(int ch, int i) {
		String result = "";

		if (ch < 20) {
			result = oneValued(ch, i);
		} else {
			result = name[1][(ch - ch % 10) / 10] + " " + oneValued(ch % 10, i);
		}
		return result;
	}

	// Возвращает числа менее 20 на естественном языке (1-19)
	public static String oneValued(int ch, int i) {
		// System.out.println("i="+i);
		String result = "";

		switch (i) {
		case 0:
			result = name[0][ch];
			break;
		case 1:
			if (ch == 2 || ch == 3 || ch == 4) {
				result = name[3][ch] + " тысячи ";
			} else if (ch == 1) {
				result = name[3][ch] + " тысяча ";
			} else {
				result = name[3][ch] + " тысяч ";
			}
			break;
		}
		return result;
	}

	// Делит заданное число на трехзначные и возвращает список трехзначных чисел
	public static ArrayList<Integer> transformation(int i) {
		ArrayList<Integer> int_res = new ArrayList<>(); // Возвращаемый массив трехзначных чисел

		String a = String.valueOf(i);
		String[] str_res = a.split("");

		String zero = ""; // Вспомогательная строка для деления числа
		int index = 0; // Счетчик при делении числа на трехзначные числа

		for (int j = str_res.length - 1; j >= 0; j--) {
			if (index < 3) {
				zero = zero + str_res[j];
				index++;
			}
			if (index == 3 || j == 0) {
				int_res.add(Integer.parseInt((new StringBuilder(String.valueOf(zero))).reverse().toString()));
				zero = "";
				index = 0;
			}
		}
		return int_res;
	}

}
