package interfaceExample1;

public class SortingImpl1 implements SortingInterface {


	@Override
	public int[] sort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for(int i=0; i<n; i++) {
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}
