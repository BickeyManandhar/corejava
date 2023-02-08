package continuebreak;

public class Continue {

	public static void main(String[] args) {
		for(int x=1;x<=20;x++) {
			if(x%2==0) {
				continue;//we skip the condition;it is only inside the loop
			}
			System.out.println("x :" +x);
		}

	}

}
