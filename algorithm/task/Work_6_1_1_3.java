package algorithm.task;

public class Work_6_1_1_3 {
	
	public static final double PI = 3.141592653589793238462643383279;

	public static void main(String[] args) {
		double x;
		double y;
		double xRad;
		double yRad;
		double result;

		x = 40.0;
		y = 30.0;

		xRad = x * PI / 180;
		yRad = y * PI / 180;
		result = ((Math.sin(xRad) + Math.cos(yRad)) / (Math.cos(xRad) - Math.sin(yRad))) * (Math.tan(x * y * PI / 180));
		System.out.println(result);
	}
}
