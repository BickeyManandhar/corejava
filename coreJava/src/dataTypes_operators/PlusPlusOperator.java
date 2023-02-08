package dataTypes_operators;

public class PlusPlusOperator {

	public static void main(String[] args) {
		int x = 2;
		int result;
		System.out.println("Value of x initally= "+x);//2
		result=++x+1; //in pre increment ,first value of x=2+1 then result= 3 +1
		System.out.println("result= "+result);
		System.out.println("Value of x after pre increment= "+x);
		int y = 5;
		System.out.println("Value of y initally= "+y);//5
		result=y++ + 2; //in post increment, result=(y+2) then value of becomes y=y+1
		System.out.println("result = "+result);
		System.out.println("Value of y after post increment= "+y);
		//to make the concept clear
		int z=8;
		System.out.println("initial value of z: "+ z);
		System.out.println("z being post incremented: "+ z++);
		System.out.println("value of z after post increment: "+ z); //value incremented
		int k=9;
		System.out.println("initial value of k: "+ k);
		System.out.println("k being pre incremented: "+ ++k);
		System.out.println("value of k: "+ k);

	}

}
