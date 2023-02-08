package ReverseNumber;

public class CountEvenAndOdd {

	public static void main(String[] args) {
		int num= 12345;
		int counterodd = 0;
		int countereven = 0;
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				countereven++;
			}
			else {
				counterodd++;
			}
			
			num=num/10;
		}
		System.out.println("Number of odd:" +counterodd);
		System.out.println("Number of even:" +countereven);

	}

}
