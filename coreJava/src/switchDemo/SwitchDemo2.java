package switchDemo;

import java.util.Random;

public class SwitchDemo2 {

	public static void main(String[] args) {
		int input = new Random().nextInt(20);
		
		System.out.println("Your number is: "+input);
		switch(input) {
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("Number out of bound. Please re-run the program.");
		}

	}

}
