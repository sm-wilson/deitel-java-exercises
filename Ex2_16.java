// Collect two integers from user and compare them (tell which one is greater or if they're equal)

import java.util.Scanner;

public class Ex2_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("These numbers are equal.");
        }

        else if (num1 > num2) {
            System.out.printf("%d is greater than %d.\n", num1, num2);
        }

        else {
            System.out.printf("%d is greater than %d.\n", num2, num1);
        }

        input.close();
    }
}
