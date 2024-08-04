
public class student {
	
	int age;
	int rollno;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void display2() {
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		student dc= new student();
		dc.display1();
		dc.display2();
		dc.age=45;
		System.out.println(dc.age);
		dc.rollno=232232;
		System.out.println(dc.rollno);
	}
}
