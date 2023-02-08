package method;

public class ExampleFunction2 {

	public static void main(String[] args) {
		hello();
		System.out.println(name());
	}
	
	public static String name() {
		String hi = hi();
		String namee= " my name is Bickey.";
		return hi+namee;
	}
	
	public static void hello() {
		System.out.println("Hello Class");
	}
	
	public static String hi() {
		return "Hi,";
	}

}
