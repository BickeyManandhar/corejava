package thisKeyword;

public class ThisDemo2 {
	String name = "Instance Home"; // instance variable

	// default constructor
	ThisDemo2() {
		name = "Bickey's Home"; // changing name
	}

	public void display() {
		String name = "Display Home"; // this is local variable know to methos only
		System.out.println("Display name is: " + name);
		System.out.println("Instance name is: " + this.name);// this keyword holds the address of the object of the
																// class
	}

	public static void main(String[] args) {
		ThisDemo2 td2= new ThisDemo2();
		td2.display();
	}

}
