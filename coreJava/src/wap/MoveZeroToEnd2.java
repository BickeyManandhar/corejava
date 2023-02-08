package wap;

public class MoveZeroToEnd2 {

	public static void main(String[] args) {
		int num = 1041004;
		int count = 0;
		int z = 0;
		int fin = 0;
		while (num > 0) {
			int rem = num % 10;
			int power = (int)Math.pow(10, z);// for power of 10 i.e. 10^z
			if (rem == 0) {
				fin = fin * 10;
			} else {
				fin = fin + rem * power;
			}
			z++;
			num = num / 10;
		}
		System.out.println(fin);

	}

}
