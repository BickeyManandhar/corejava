package thisKeyword;

public class MobileMain {

	public static void main(String[] args) {
		Mobile mb1 = new Mobile();
		mb1.specs();
		System.out.println(mb1.brand);// public can be accessed
		System.out.println("=========================");
		
		Mobile mb2 = new Mobile("Green", "D1234567");
		mb2.specs();
		System.out.println("=========================");
		
		Mobile mb3 = new Mobile("Apple", "Space Grey", "I1234567", 1500.00);
		mb3.specs();
		System.out.println("=========================");
		
		Mobile mb4 = new Mobile();
		System.out.println("Data consumed: "+mb4.dataConsumed(13));
	}

}
