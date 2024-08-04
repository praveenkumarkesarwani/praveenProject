package pkg29_01;

public class swift1 extends Maruti
{  public swift1()
	{this(22,33);
	System.out.println("child default constructor");
	}
   public swift1(int a)
   {this(35,36,37);
   System.out.println("child one parameterized constructor");
   }
   public swift1(int a,int b)
   {super(12,13);
   System.out.println("child two parameterized constructor");
   }
   public swift1(int a,int b,int c)
   {this();
	   System.out.println("child three parameterized constructor");
   }
public static void main(String[] args) {
	swift1 obj=new swift1(333);
}
}
