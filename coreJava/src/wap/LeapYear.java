package wap;

public class LeapYear {

	public static void main(String[] args) {
		// leap year - a year divisible by 4
		int year = 2023;
		if(year%4==0) {
			System.out.println("Year "+year+" is a leap year.");
		}
		else {
			System.out.println("Year "+year+" is not a leap year.");
		}

	}

}
