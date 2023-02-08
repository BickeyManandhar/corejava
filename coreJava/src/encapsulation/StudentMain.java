package encapsulation;

public class StudentMain {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		
		System.out.println(c1.getName());
		c1.setName("Bickey");
		
		System.out.println(c1.getId());
		c1.setName("Bickey");

	}

}
