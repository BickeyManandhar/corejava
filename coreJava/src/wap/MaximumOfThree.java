package wap;

public class MaximumOfThree {

	public static void main(String[] args) {
		int a=12;
		int b=90;
		int c=56;
		if(a>b && a>c) {
			System.out.println("Maximum is a: "+a);
		}
		else if(b>a && b>c) {
			System.out.println("Maximum is b: "+b);
		}
		else{
			System.out.println("Maximum is c: "+c);
		}

	}

}
