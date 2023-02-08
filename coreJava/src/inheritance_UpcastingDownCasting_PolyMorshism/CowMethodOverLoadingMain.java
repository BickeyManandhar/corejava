package inheritance_UpcastingDownCasting_PolyMorshism;

public class CowMethodOverLoadingMain {

	public static void main(String[] args) {
		// we check Cow for method and check Calf for definition of method
		Cow cw = new MethodOverLoading();
		cw.walk();
		cw.eat();// this check Cow for method and check Calf for definition of method

		System.out.println("=================");

		Cow co = new Cow();
		co.eat();

	}

}
