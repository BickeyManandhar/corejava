package inheritance_UpcastingDownCasting_PolyMorshism;

public class CowPolyMorphismMain {

	public static void main(String[] args) {
		// When a method shows different behavior at runtime on same interface, it is
		// called Polymorphism
		
		Cow cc = new Cow();
		cc.eat();
		
		cc=new Calf();
		cc.eat();
		
		cc=new PolyMorphism();
		cc.eat();

	}

}
