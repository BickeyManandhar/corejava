package method;

import java.util.Scanner;

public class ExampleFunction {

	public static void main(String[] args) {
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for x: ");
		x = sc.nextInt();
		System.out.print("Enter value for y: ");
		y = sc.nextInt();
		System.out.println("The sum of x and y: " + sum(x, y));

	}

	public static int sum(int a, int b) {
		return a + b;
	}
}
