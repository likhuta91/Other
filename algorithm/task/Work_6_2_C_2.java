package algorithm.task;

/*Дана точка А(х, у). Определить, принадлежит ли она треугольнику 
 с вершинами в точках (х1, у1), (х2, у2), (x3, y3).
 */

public class Work_6_2_C_2 {

	public static void main(String[] args) {
		// Координаты точек 1,2,3 n
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 2;
		double x3 = 2;
		double y3 = 0;
		double xn = 0.5;
		double yn = 0.5;

		boolean marker = false;

		if ((xn == x1 && yn == y1) || (xn == x2 && yn == y2) || (xn == x3 && yn == y3)) {
			marker = true;
		} else {
			double yq = ((y2 - y3) * (y1 * xn - x1 * yn + y1 * x1) - y1 * x1 * y2 + (yn - y1) * (y2 * x3 - x2 * y3))
					/ (x1 * (y3 - y2) + x2 * (yn + y1) + x3 * (yn - y1) - xn * (y3 - y2));
			double xq = (yq - y2) * (x3 - x2) / (y3 - y2) + x2;
			double side_q2 = distance(xq, yq, x2, y2);
			double side_q3 = distance(xq, yq, x3, y3);
			double side_23 = distance(x2, y2, x3, y3);
			double side_1n = distance(x1, y1, xn, yn);
			double side_nq = distance(xn, yn, xq, yq);
			double side_1q = distance(x1, y1, xq, yq);

			int lenght_23 = (int) ((side_q2 + side_q3 - side_23) * 1000000000);
			int lenght_1q = (int) ((side_1n + side_nq - side_1q) * 1000000000);

			if (lenght_23 == 0 && lenght_1q == 0) {
				marker = true;
			}
		}
		System.out.println(marker);
	}

	public static double distance(double x1, double y1, double x2, double y2) {
		double dist = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
		return dist;

	}

}
