package First;

class Car{
	String color;
	int year;
	int maxSpeed;
	
	void accelarate() {
		System.out.println("Car is accelarating");
	}
	
	void setMaxSpeed(int x)//Declaration
	{
		//Setter functions
		maxSpeed = x;
	}
	
	int getMaxSpeed() {
		return maxSpeed; //We can return only one value in one function
	}
}

public class ClassObj{
	public static void main(String args[]) {
		
		Car Mustang = new Car();
		System.out.println(Mustang.year);
		System.out.println(Mustang.color);
		Mustang.year=2019;
		Mustang.color="Red";
		Mustang.accelarate();
		Mustang.maxSpeed=250;
		Mustang.setMaxSpeed(Mustang.maxSpeed);
		int Speed = Mustang.getMaxSpeed();
		System.out.println("Speed: "+Speed);
		System.out.println("Manufacturing year: "+Mustang.year);
		System.out.println("Car Color: "+Mustang.color);
	}
}
