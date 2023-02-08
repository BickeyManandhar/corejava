package thisKeyword;

public class Mobile {
	//attributes
	public String brand;
	private String color;
	private String imei;
	private double price;

	// no argument constructor
	Mobile() {
		color = "black";
		imei = "B12345678";
	}

	Mobile(String color, String imei) {
		this.color = color;
		this.imei = imei;
	}

	//overloading
	Mobile(String brand, String color, String imei, double price) {
		this.brand = brand;
		this.color = color;
		this.imei = imei;
		this.price = price;
	}
	//method or behavior or function
	public void specs() {
		String color = "white";
		String brand = "Samsung";
		System.out.println("Brand: " + this.brand);// this will ignore local variable and look at the the instance
		System.out.println("Price: " + price);// first look for local variable, if not go for instance variable
		System.out.println("Color: " + this.color);// this will ignore local variable and look at the the instance											// variable
		System.out.println("IMEI: " + imei); // first look for local variable, if not go for instance variable
		
	}
	
	public double dataConsumed(double runTime) {
		double pricePerHour=runTime*2;
		return pricePerHour;
	}

}


