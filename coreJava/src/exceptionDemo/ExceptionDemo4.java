package exceptionDemo;

import java.util.Scanner;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		//before exceptions were thrown by JVM: ArithmeticException, NullPointer and others
		// we user throw to make our own exception
		//throw is used to throw the exception
		
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		try {
			if(name.equals("500pks")) {
				Exception ex = new Exception("500pks name is not permitted! ");
				throw ex;
			}
		}catch(Exception e){
			System.out.println(e.getMessage()); //this will print the exception written inside line 18
			return;//will not print from line 25 unless there is any finally block
		}
		System.out.println("Hello Name "+name);
		System.out.println("Main method ends successfully.");
	}

}
