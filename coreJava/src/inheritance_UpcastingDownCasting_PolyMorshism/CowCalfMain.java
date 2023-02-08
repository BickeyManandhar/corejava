package inheritance_UpcastingDownCasting_PolyMorshism;

public class CowCalfMain {

	public static void main(String[] args) {
		// upcasting: reference of super class holding the object of subclass
		//we check Cow for method and check Calf for definition of method
		Cow cw = new Calf();
		cw.eat();
		cw.walk();
		// cw.cry(); //in upcasting we cannot call the attributes or methods of child
		// class

		System.out.println("===========");
		
		//downcasting
		Calf cf= (Calf)cw;
		cf.eat();
		cf.walk();
		cf.cry(); // in downcasting we can call the attributes or methods of child
		// class
		
	}

}
