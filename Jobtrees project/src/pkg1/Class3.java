package pkg1;

public class Class3 
{
	public void method1()
	{
		System.out.println("default constractor");
	}
	
    public void method2(int a )
    {
    	System.out.println("one parametrized constractor");
    }
    public void method3(int a,int b)
    {this.method4(2,3,4,5);
     this.method1();
     this.method2(2);
     this.method4(1,2,3);
    	System.out.println("\ntwo parametrized constractor");
    
    }
    public void method4(int a,int b,int c)
    { 
    	System.out.println("\nthree parametrized constractor");
    }
    public void method4(int a,int b,int c,int d)
    {
    	System.out.println("four parametrized constractor");
    	
    }
    
    public static void main(String[] args) 
    
    { 
    	Class3 obj=new Class3();
    	obj.method3(5,6);
		
	}
}
