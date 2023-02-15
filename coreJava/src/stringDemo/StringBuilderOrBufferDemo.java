package stringDemo;

public class StringBuilderOrBufferDemo {

	public static void main(String[] args) {
		// for creating and manipulating mutable strings java provides 2 classes
		// StringBuilder (more efficient)
		// StringBuffer (for multithreading environment)

		StringBuilder sb1 = new StringBuilder("mohan");

		System.out.println(sb1.insert(0, "hello "));
		System.out.println(sb1.insert(6, "hi "));

		System.out.println(sb1.append(" babu"));

		System.out.println(sb1.delete(6, 9));

		System.out.println(sb1.reverse());

		String s = sb1.toString();// It converts the content of StringBuffer/Builder to String

		StringBuilder sb2 = new StringBuilder("soojan");
		StringBuilder sb3 = new StringBuilder("soojan");
		System.out.println(sb2.equals(sb3));// false as equals() is not overridden so it compares addresses

		String s1 = sb2.toString();
		String s2 = sb3.toString();
		System.out.println(s1.equals(s2));// true as String class overrides equals()
	}

}
