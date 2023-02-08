package objectConcept;

//class is content description
public class Laptop {
	// defining attributes
	String brand;
	String color;
	int ram;
	int memory;

	// constructor: special method to initialize attributes
	// same name as class
	// has no return type
	Laptop(String b, String c, int r) {
		brand = b;
		color = c;
		ram = r;
	}

	// Overloading a constructor: Sometimes there is a need of initializing an
	// object in different ways. This can be done using constructor overloading.
	Laptop(String b) {
		brand = b;
		color = "Red";
		ram = 32;
	}
	
	Laptop(String b, String c, int r, int m) {
		brand = b;
		color = c;
		ram = r;
		memory = m;
	}

	public void disp() {
		System.out.println("My laptop is from: " + brand);
		System.out.println("Color of my laptop is: " + color);
		System.out.println("RAM of my laptop is: " + ram +"\n");
	}
}
