package abstraction;

public abstract class OldNokiaPhone {
	//we cannot create object of abstract class
	//but we can create the object of its child class
	//it can contain abstract and non abstract method
	//it is not mandatory to have abstract method in abstract class
	//child class must implement the abstract method
	//purpose of abstract class is re-usability of code
	public void game() {
		System.out.println("We can play snake game in this phone.");
	}
	
	public abstract void canTakePicture();
}
