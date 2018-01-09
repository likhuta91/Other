package algorithm.task;

/*Используя все цифры от 1 до 9 по одному разу и операции сложения и вычитания, 
получить в сумме 100, при условии, что цифры появляются в возрастающем или убывающем порядке.
Например,
123 + 4 - 5 + 67 - 89 = 100,
9 – 8 + 76 – 5 + 4 + 3 + 21 = 100.*/

public class Work_6_5_C_9 {

	// Массив для последовательности 123456789
	/*
	 * public static int[][] tabl = { { 1, 12, 123 }, { 2, 23, 234 }, { 3, 34, 345},
	 * { 4, 45, 456 }, { 5, 56, 567 }, { 6, 67, 678 }, { 7, 78, 789 }, { 8, 89 }, {
	 * 9 } };
	 */

	// Массив для последовательности 987654321
	public static int[][] tabl = { { 9, 98, 987 }, { 8, 87, 876 }, { 7, 76, 765 }, { 6, 65, 654 }, { 5, 54, 543 },
			{ 4, 43, 432 }, { 3, 32, 321 }, { 2, 21 }, { 1 } };

	public static String last_el = String.valueOf(tabl[tabl.length - 1][0]); // Последний элемент последовательности

	public static void main(String[] args) {
		for (int i = 0; i < tabl[0].length; i++) {
			int[] ch = { tabl[0][i] };
			String[] str = { String.valueOf(tabl[0][i]) };
			rekursia(i, ch, str);
		}
	}

	public static int[] newCh(int[] old_ch, int el) {
		int[] new_ch = new int[old_ch.length * 2];
		for (int i = 0; i < new_ch.length / 2; i++) {
			new_ch[(new_ch.length / 2) + i] = old_ch[i];
			new_ch[i] = old_ch[i];
			new_ch[i] = new_ch[i] + el;
			new_ch[(new_ch.length / 2) + i] = new_ch[new_ch.length / 2 + i] - el;
		}
		return new_ch;
	}

	public static String[] newStr(String[] old_str, int el) {
		String[] new_str = new String[old_str.length * 2];
		for (int i = 0; i < new_str.length / 2; i++) {
			new_str[(new_str.length / 2) + i] = old_str[i];
			new_str[i] = old_str[i];
			new_str[i] = new_str[i] + "+" + el;
			new_str[(new_str.length / 2) + i] = new_str[new_str.length / 2 + i] + "-" + el;
		}
		return new_str;
	}

	public static void rekursia(int i, int[] ch, String[] str) {

		for (int j = 0; j < tabl[i + 1].length; j++) {
			int[] new_ch = newCh(ch, tabl[i + 1][j]);
			String[] new_str = newStr(str, tabl[i + 1][j]);
			if (String.valueOf(tabl[i + 1][j]).contains(last_el)) {
				proverkaNa100(new_ch, new_str);
				break;
			}
			int i2 = i + 1 + j;
			rekursia(i2, new_ch, new_str);
		}
	}

	public static void proverkaNa100(int[] ch, String[] str) {
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 100) {
				System.out.println(str[i]);
			}
		}
	}
}
