package algorithm.task;

public class Work_6_1_1_5 {

	public static final double PI = 3.141592653589793238462643383279;
	public static final double E = 2.7182818284590452353602874713527;

	public static void main(String[] args) {
		double x;
		double y;
		double result;

		x = 2;
		y = 3;

		result = (3 + Math.pow(E, (y - 1))) / (1 + Math.pow(x, 2) * Math.abs(y - Math.tan(x * PI / 180)));

		System.out.println(result);
	}
}