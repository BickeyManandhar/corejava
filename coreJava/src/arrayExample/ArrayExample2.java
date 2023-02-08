package arrayExample;

public class ArrayExample2 {

	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int sum=0;
		
		System.out.println("----------------");
		System.out.print("Sum of all elements of a1:");
		for(int i=0;i<a1.length;i++) {
			sum=sum+a1[i];
			//sum+=a1[i];
		}
		System.out.println(sum);

	}

}
