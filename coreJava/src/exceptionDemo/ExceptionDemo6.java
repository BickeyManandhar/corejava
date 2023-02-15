package exceptionDemo;

public class ExceptionDemo6 {

	public static void main(String[] args) {
		// we need to write try catch block for checked exception

		try {
			Class.forName("com.mysql.jdbc.driver"); // this might give you ClassNotFoundException which is checked
													// exception, so we must surround it with try catch block
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
