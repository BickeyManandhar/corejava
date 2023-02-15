package staticSuperAndFinalKeyword;

public class Student {

	// static blocks are running just after class is loaded
	static {
		System.out.println("i am from static block");
	}

	String batch;
	static String country = "nepal";// only one copy will be created
	int age;

	public Student(String batch, int age) {
		super();
		this.batch = batch;

		this.age = age;
	}

	void fly() {

		System.out.println("i can fly also");
	}

	// to call static method we do not need to create any object
	static void jump() {

		System.out.println("i can fly also");
	}

	public static void main(String[] args) {
		Student student1=new Student("jan2023",22);
		Student student2=new Student("jan2021",29);
		
		System.out.println(student1.batch +" "+student1.country);
		System.out.println(student1.batch +" "+Student.country);//best way
		
		System.out.println(student2.batch +" "+student2.country);
		
		student1.fly();
		//fly();//must need to create object as it is non static
		
		jump();

	}

}
