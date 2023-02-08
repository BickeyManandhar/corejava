package wap;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		System.out.println(moveZeroes(13940024));

	}

	static int moveZeroes(int num) {
		int zeroes = 0;
	    int result = 0;
	    double counter =0;
	    int digit;
	    int temp = num;
	    while (temp > 0) {
	        digit = temp % 10;
	        if (digit != 0) {
	            result = result * 10 + digit;
	        } else {
	            zeroes++;
	        }
	        temp /= 10;
	    }
	    for (int i = 0; i < zeroes; i++) {
	        result = result * 10;
	    }
	    int tempo=result;
	    while(result>0) {
	    	int rem=result%10;
	    	if(rem==0) {
	    		counter++;
	    	}
	    	result=result/10;
	    }
	    //System.out.println(counter);
	   // System.out.println(tempo);
	    int power= (int) Math.pow(10, counter);
	    tempo = tempo/power;
	   // System.out.println(tempo);
	    tempo= reverse(tempo)*power;
	    
	    return tempo;
	}
	static int reverse(int input) {
		int resultValue=0;
		
		while(input>0) {
			int rem = input%10;
			resultValue=resultValue*10+rem;
			input=input/10;
		}
		return resultValue;
	}
	}


