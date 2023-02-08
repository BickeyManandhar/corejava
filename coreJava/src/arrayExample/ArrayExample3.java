package arrayExample;

public class ArrayExample3 {

	public static void main(String[] args) {
		int a[]= {1,5,7,9};
		int sum=addArrayData(a); //calling function with "a" as parameter
		System.out.println(sum);

	}
	
	public static int addArrayData(int[] arr) { //taking array as argument
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			//sum+=a1[i];
		}
		return sum;
	}

}
