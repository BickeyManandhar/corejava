package inheritance_UpcastingDownCasting_PolyMorshism;

public class MethodOverLoading extends Cow {

	// Method overloading is mechanism where subclass can change the behavior of
	// super class inside subclass
	void eat() {
		System.out.println("Cow eat grains.");
	}
}
