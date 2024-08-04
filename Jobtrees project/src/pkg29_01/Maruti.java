package pkg29_01;

public class Maruti 
{
  public Maruti()
  {this(22,23,24);
	  System.out.println("parent default method");
  }
  public Maruti(int a)
  {this();
	  System.out.println("parent one parametrized method");
  }
  public Maruti(int a, int b)
  {this(27);
	  System.out.println("parent two parameterized method");
  }
  public Maruti(int a, int b, int c)
  {
	  System.out.println("parents three parameterized method");
  }
  public static void main(String[] args) {
	Maruti obj=new Maruti();
}
}
