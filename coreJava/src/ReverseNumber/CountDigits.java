package ReverseNumber;

public class CountDigits {
	public static void main(String[] args) {
		int input=1221334511;
		int counter1= 0;
		int counter2= 0;
		int counter3= 0;
		int counter4= 0;
		int counter5= 0;
		while(input>0) {
			int rem=input%10;
			if(rem==1) {
				counter1++;
			}
			else if(rem==2){
				counter2++;
			}
			input=input/10;
		}
		System.out.println("Total number of 2's: "+counter2);
	}
}
