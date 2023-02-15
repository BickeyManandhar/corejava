package exceptionDemo;

import java.util.Scanner;

public class ExceptionDemo5 {

	static String userInput() throws Exception { // this is the declaration to the caller method, in this case main
													// method, that this method throws exception
		String name;
		String password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		System.out.println("Enter your password: ");
		password = sc.nextLine();
		if (!name.equals("Bickey") && !password.equals("abcd@12345")) {
			Exception ex = new Exception("You are not our active user. Please sign in.");
			throw ex;
		}
		return name;
	}

	public static void main(String[] args) {
		// throws by method
		String enteredName = null;
		try {
			enteredName = userInput();
			System.out.println("Hello " + enteredName + ", you have signed in successfully.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
