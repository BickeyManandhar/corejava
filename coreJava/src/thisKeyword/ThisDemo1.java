package thisKeyword;

public class ThisDemo1 {
	// this contains address of a calling object
	String color = "white";
	int price = 1000000;

	void show() {
		System.out.println("color= "+color);
		System.out.println("price= "+price);
		System.out.println("this= "+this); //this gives same address as address of td1
	}

	public static void main(String[] args) {
		ThisDemo1 td1 = new ThisDemo1();
		td1.show();
		System.out.println("td1= "+td1);// gives same address as address of this
	}

}
