package abstraction;

public class NewNokiaPhone extends OldNokiaPhone {
	@Override
	public void canTakePicture() {
		System.out.println("We can take pictures in new Nokia Phones.");

	}

	public static void main(String[] args) {
		OldNokiaPhone o = new NewNokiaPhone(); // since we cannot create object of abstract class we doing upcasting
		o.canTakePicture();
		o.game();

	}

}
