package Variabletypes;
class Student{
	int rollno;
	String name;
}
public class MainClass {
	Student s2 = new Student();
	void setRollNo(int x) {
		s2.rollno=x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(); //s is a local reference variable, Stack
		s.rollno = 1;
		s.name = "Laxman";
		MainClass obj = new MainClass();
		obj.setRollNo(2);
		System.out.println(obj.s2.rollno);
	}

}
