package exceptionDemo;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// using multiple catch block
		// specific exceptions must come first while generic exception should be in the
		// last catch
		
		int a = 20, b= 10, c=0;
		
		try {
			System.out.println(a/b);
			System.out.println(a/c);//run time error(ArithmeticException)/program terminates abnormally
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception handled here.");
		}
		catch(Exception e) {
			System.out.println("Exception handled here.");
		}
		
		System.out.println("The result of subtraction is "+""+ (a-b));
	}

}
