package javaTutorial;

public class Calc {

	public static void main(String[] args) {
		int num1 = 5, num2 = 10, sum = 0, diff = 0, mul = 0;
		float division = 0f;

		// Calling function sum
		sum = Calc_addition(num1, num2);
		System.out.println("sum of 2 numbers : " + sum);

		// Calling function Difference
		diff = Calc_difference(num1, num2);
		System.out.println("Diff of 2 numbers : " + diff);

		// Calling function Multiply
		mul = Calc_multiply(num1, num2);
		System.out.println("Multiply of 2 numbers : " + mul);

		// Calling function Divide
		division = Calc_divide(num1, num2);
		System.out.println("Division of 2 numbers : " + division);
	}

	public static int Calc_addition(int num1, int num2) {
		// To calculate Sum
		int sum = num1 + num2;
		return sum;
	}

	public static int Calc_difference(int num1, int num2) {
		int diff;
		// To calculate Difference
		if (num1 > num2) {
			diff = (num1 - num2);
		} else {
			diff = (num2 - num1);
		}
		return diff;
	}

	public static int Calc_multiply(int num1, int num2) {
		int mul;
		// To calculate Multiply
		mul = num1 * num2;
		return mul;
	}

	public static float Calc_divide(int num1, int num2) {
		// To calculate Division
		float div = num1 / num2;
		return div;
	}
}
