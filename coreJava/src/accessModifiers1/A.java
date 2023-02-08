package accessModifiers1;

public class A {

	public int w = 1; // public is accessible every where in the application
	int x = 2; // default is accessible inside and outside the class within the same package
	protected int y = 3; // protected is accessible within the same package and outside the package but
							// only within its child class
	private int z = 4; //private is accessible within the same class only
	
	public static void main(String args[]) {
		A a= new A();
		System.out.println(a.w);
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println(a.z);
	}
}

