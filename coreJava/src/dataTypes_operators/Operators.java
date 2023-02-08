package dataTypes_operators;

public class Operators {

	public static void main(String[] args) {
		int a= 10;
		int b=12;
		int sum=a+b;
		int diff=b-a;
		int mult=a*b;
		float div= (float) a/b;
		boolean isTrue=true;
		boolean isFalse=false;
		char grade = 'A';
		String name = "Bickey";
		long l=999999999;
		System.out.println("Value of a: "+a+"\n"+"Value of b: "+b+"\n"+"Value of grade: "+grade+"\n"+"Value of l: "+l+"\n"+"Value of isTrue: "+isTrue+"\n"+"Value of isFalse: "+isFalse+"\n");
		System.out.println("My name is "+name);
		System.out.println("I am expecting to get a letter grade: "+grade);
		System.out.println("Sum of a and b: "+sum);
		System.out.println("Difference of a from b: "+diff);
		System.out.println("Multiplication of a and b: "+mult);
		System.out.println("Division of a by b: "+div);
		System.out.println("Value of l: "+l);
		
		
		if(a<b) {
			System.out.println(isTrue);
		}
		else {
			System.out.println(isFalse);
		}

	}

}
