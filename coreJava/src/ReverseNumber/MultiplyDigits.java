package ReverseNumber;

public class MultiplyDigits {

	public static void main(String[] args) {
		int num= 12345;
		int result = 1;
		while(num>0) {
			int rem=num%10;
			result=result*rem;
			num=num/10;
		}
		System.out.println("Multiplication of each digits: "+result);

	}

}
