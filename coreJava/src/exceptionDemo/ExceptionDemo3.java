package exceptionDemo;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// no matter exception comes or not, finally block will execute
		// regardless of the exception in the program, finally block will still execute
		// we write finally right after the last catch block
		//if there is System.exit(0) before finally {}, then only finally{} will not be executed
		//only one finally block is allowed with try block
		int a = 20, b = 10, c = 0;

		try {
			System.out.println(a / b);
			System.out.println(a / c);// run time error(ArithmeticException)/program terminates abnormally
//			if(a/b==2) {
//				return;//this will not let to print line 26 but still print finally block
//			}
		} catch (NullPointerException e) { // arithmetic exception will not be caught here
			System.out.println("Exception handled here.");
		} finally {
			//we close connections with DB/server in later classes
			System.out.println("Finally block: I will always be executed regardless of any exception.");
		}

		System.out.println("The result of subtraction is " + "" + (a - b)); // this will not print as there is exception
																			// before this line
																		    //if there is return; before this line
																		//this line will be not executed
	}

}
