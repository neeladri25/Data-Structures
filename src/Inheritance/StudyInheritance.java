package Inheritance;
class Shape //parent class, base class, super class
{ 
	double pi=3.14;
	double getSquare(int r) 
	{
		return r*r;
	}
	void parentHashcode() {
		System.out.println("Parent: "+this.hashCode());
	}
}

class Circle extends Shape //child class, derived class, sub classes
{ 
	void area(int r)
	{
		System.out.println(pi*getSquare(r));
	}
	void childHashcode() {
		System.out.println("Child: "+this.hashCode());
	}
}

public class StudyInheritance { // Inheritance represents the IS-A relationship or parent-child relationship

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.area(5);
		
		c.childHashcode();
		c.parentHashcode();

	}

}
