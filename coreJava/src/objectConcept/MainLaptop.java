package objectConcept;

public class MainLaptop {

	public static void main(String[] args) {
		// we are initializing attributes while creating object which is better for
		// designing

		// object : real entity which we can uniquely identify in the basis of
		// attributes and behaviors
		Laptop l1 = new Laptop("HP", "Black", 4);
		l1.disp();
		Laptop l2 = new Laptop("Apple", "Space Gray", 8);
		l2.disp();
		Laptop l3= new Laptop("Samsung");
		l3.disp();
		Laptop l4 = new Laptop("LG", "White", 16, 256);
		l4.disp();
	}
}
