package pkg1;

public class Student
{

	int age; //its a variable ----age---it will store int value
	int roll_no;
	public void display1()
	{
		System.out.println("welcome to all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) 
	{
		
		Student obj=new Student();
		obj.age=25;
		obj.display1();
		obj.display2();
		System.out.println(obj.age);
		obj.roll_no=44444;
		System.out.println(obj.roll_no);
		
	}
			
}
