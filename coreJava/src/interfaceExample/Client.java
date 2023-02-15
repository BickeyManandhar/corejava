package interfaceExample;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a message: ");
		input = sc.next();
		
		MessageChecker mc = new MessageCheckerImpl();
		System.out.println("Message status: " + mc.check(input));
	}

}
