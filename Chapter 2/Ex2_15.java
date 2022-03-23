// Ask user for two integers, then print sum, product, difference, quotient.

import java.util.Scanner;

public class Ex2_15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int num1 = input.nextInt();

		System.out.print("Enter second integer: ");
		int num2 = input.nextInt();

		int add = num1 + num2;
		int subtract = num1 - num2;
		int product = num1 * num2;
		double divide = num1 / num2;

		System.out.printf("%d + %d = %d\n", num1, num2, add);
		System.out.printf("%d - %d = %d\n", num1, num2, subtract);
		System.out.printf("%d x %d = %d\n", num1, num2, product);
		System.out.printf("%d + %d = %.2f\n", num1, num2, divide);

		input.close();
	}
}