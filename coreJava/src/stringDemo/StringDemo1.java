package stringDemo;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = "Bickey"; // using literals // String pool or intern pool
		String s2 = new String("Bickey");// using new keyword // heap area

		String s3 = "Bickey"; // using literals // String pool or intern pool
								// in string pool, since "Bickey" is available previously, so it will not take
								// new space. Instead it will point to same data
		String s4 = new String("Bickey");// using new keyword // heap area
											// in heap, even though same data data exist, it will still create new
											// memory location and point to its corresponding string location
		String s5 = "Hello";

		///////////////////////

		// comparing string by == (Compares address of string)

		System.out.println(s1 == s2); // false
		System.out.println(s1 == s3); // true
		System.out.println(s1 == s5); // false
		System.out.println(s2 == s4); // false
		///////////////////////
		// integer before string adds and after string concatenate
		System.out.println(2 + 3 + s1); // 5Bickey
		System.out.println(2 + 3 + s1 + 2);// 5Bickey2
		System.out.println(2 + 3 + s1 + 2 + 3);// 5Bickey23

		//////////////////////////

		// calculate length

		System.out.println(s1.length());// 6
		System.out.println(s5.length());// 5

		// substring()
		System.out.println(s1.substring(1));// ickey
		System.out.println(s1.substring(0));// Bickey

		System.out.println(s1.substring(0, 4));// Bicke
		System.out.println(s1.substring(0, 5));// Bickey

		// charAt()
		System.out.println(s1.charAt(0));// starting character B
		System.out.println(s1.charAt(5));// last character y

		System.out.println(s1.charAt(s1.length() - 1));// last character y

		// print all characters
		for (int i = 0; i < s1.length(); i++) {

			System.out.println(s1.charAt(i));

		}

		// equals()-compares objects by content if that class overrides
		// equals() otherwise it compares address

		System.out.println(s1.equals(s2));// compares contents of Strings as String class overrides equals()

		// compareTo()-compares strings lexicographically(dictionary order),returns -ve
		// if string1 is less than second,
		// +ve if string 1 is greater than string2,0 if both are same

		System.out.println(s1.compareTo("Aman"));// +ve
		System.out.println(s1.compareTo("dip"));// -ve
		System.out.println(s1.compareTo("Bickey"));// 0

		//////////////////////////

		// strings are immutable
		// which means once they are created, they cannot be modified

		// String st = "John";
		// st = st + " Shrestha"; //here new string is created inside java heap
		// System.out.println(st);

		// for creating and manipulating mutable strings java provides 2 classes
		// StringBuilder (more efficient)
		// StringBuffer (for multithreading environment)

	}

}
