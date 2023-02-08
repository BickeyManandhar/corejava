package switchDemo;

public class PracticeQuestions {

	public static void main(String[] args) {
		int arr[]= {10,20,10,30,10,40,0,90,33,90,10};
		int count10=0;
		int highest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==10) {
				count10++;
			}
		}
		System.out.println("Frequency of 10: "+count10);
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]>arr[i]) {
				highest=arr[i-1];
			}
			else {
				highest=arr[i];
			}
		}
		System.out.println("Highest: "+highest);
	}

}
