package abstraction;

public class MainPhone {

	public static void main(String[] args) {
		OldNokiaPhone o = new NewNokiaPhone(); // since we cannot create object of abstract class we doing upcasting
		o.canTakePicture();
		o.game();
	}

}
