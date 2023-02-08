package arrayExample;

public class ArrayExample1 {

	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int[] a2 = {6,7,8,9,10,15};
		int [] a3 = {11,12,13};
		
		System.out.println(a1.length);
		System.out.println(a2.length);
		System.out.println(a3.length);
		
		System.out.println("----------------");
		System.out.println("a1:");
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}

	}

}
