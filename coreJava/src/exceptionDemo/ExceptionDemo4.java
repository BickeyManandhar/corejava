package exceptionDemo;

import java.util.Scanner;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		//before exceptions were thrown by JVM: ArithmeticException, NullPointer and others
		// we user throw to make our own exception
		//throw is used to throw the exception
		
		String name;
		String password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		System.out.println("Enter your password: ");
		password = sc.nextLine();
		try {
			if(name!="Bickey" && password != "abcd@12345") {
				Exception ex = new Exception("500pks name is not permitted! ");
				throw ex;
			}
		}catch(Exception e){
			System.out.println(e.getMessage()); //this will print the exception written inside line 18
			return;//will not print from line 25 unless there is any finally block
		}
		System.out.println("Hello "+name+" ,you have successfully entered.");
		System.out.println("Main method ends successfully.");
	}

}
