/*Create a class named Car with attributes make, model, and year. Include a method displayInfo that prints 
the car's details. Create an object of this class and call the displayInfo method.*/

public class Car {
String make = "Tata";
String model = "Punch";
int year = 2021;

public void displayInfo() {
//	System.out.println("Make =  " + make);
//	System.out.println("Model is :" + model);
//	System.out.println("Year is :" + year);
	
}
	public static void main(String[]args) {
		Car c= new Car();
		c.displayInfo();
		
//		String string= "ashok";
//		System.out.println(string.toUpperCase());
//		
		int z= Math.max(40, 10);
		int z1= Math.min(40, 10);
		System.out.println("max : "+z);
		System.out.println("min "+ z1);
		
		
	}
}
