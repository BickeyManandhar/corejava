package interfaceExample1;

public class User {

	public static void main(String[] args) {
		int[] arr= {7,1,9,12,3};
		
		SortingInterface si1 = new SortingImpl1();
		int[] result1 = si1.sort(arr);
		System.out.println("Ascending order: ");
		for(int i: result1) {
			System.out.println(i);
		}
		
		System.out.print("\n");
		
		SortingInterface si2 = new SortingImpl2();
		int[] result2 = si2.sort(arr);
		System.out.println("Descending order: ");
		for(int i: result2) {
			System.out.println(i);
		}

	}

}
