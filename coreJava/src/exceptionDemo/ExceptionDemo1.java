package exceptionDemo;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// exception in java is an error event that can happen during the execution of a
		// program and disrupts the execution of a program and disrupts its normal flow.
		//if we want to avoid abnormal termination of a program then we have to do exception handling
		//five keywords -try, catch, finally, throw and throws
		//catch block will be executed only when there is some exception in try block
		
		int a = 10, b = 20, c=0;
		
		try {
			System.out.println(b/a);
			System.out.println(a/c); //run time error(Exception)/program terminates abnormally	
		}
		catch(Exception e) {
			System.out.println("Exception handled here.");
		}

		System.out.println("The result of subtraction is "+""+ (b-a));
	}

}
