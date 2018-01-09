package algorithm.task;

public class Work_6_1_1_17 {
	public static final double PI = 3.141592653589793238462643383279;

	public static void main(String[] args) {
		double x;
		double y;
		double result;

		x = 5;
		y = 6;

		result = x * Math.log(x) + y / (Math.cos(x * PI / 180) - x / 3);

		System.out.println(result);
	}
}