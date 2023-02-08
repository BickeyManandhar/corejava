package accessModifiers1;

public class B {

	public static void main(String args[]) {
		A a= new A();
		System.out.println(a.w);
		System.out.println(a.x);
		System.out.println(a.y);
		//System.out.println(a.z); //z is private and can be called within the same class only
	}
}
