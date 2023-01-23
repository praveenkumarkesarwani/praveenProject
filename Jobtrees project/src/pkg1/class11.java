package pkg1;

public class class11
{ 
	public class11()
	{
		this(1,2,3);
	System.out.println("Default constructor");
	}
	public class11(int a)
	{
		this();
	System.out.println("one parametrized constructor");
	}
	public class11(int a,int b)
	{
		this(1,2,3,4);
	System.out.println("two parameterized constructor");}
	
	
	public class11(int a,int b,int c)
	{
	System.out.println("three parametrized constructor");
	}
	public class11(int a,int b,int c,int d)
	{
		this(1);
	System.out.println("four parametrized constructor");
	}
	public static void main(String[] args) {
	{
		class11 obj= new class11(5,4);}
	}
}

