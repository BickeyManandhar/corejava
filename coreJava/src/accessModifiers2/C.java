package accessModifiers2;

import accessModifiers1.A;

public class C extends A {
	public static void main(String args[]) {
		C c = new C();
		System.out.println(c.w);
		// System.out.println(a.x); //default is accessible in same package only
		System.out.println(c.y); // protected is accessible within package and outside the package inside the
									// child class
		// System.out.println(a.z);//private is accessible within the same class only
	}
}
