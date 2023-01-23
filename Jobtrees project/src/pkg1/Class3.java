package pkg1;

public class Class3 
{
	public Class3()
	{
		System.out.println("default constractor");
	}
	
    public Class3(int a )
    {
    	System.out.println("one parametrized constractor");
    }
    public Class3(int a,int b)
    {
    	System.out.println("two parametrized constractor");
    }
    public static void main(String[] args) 
    
    { 
    	Class3 obj=new Class3();
    	Class3 obj2=new Class3(343);
    	Class3 obj3=new Class3(34,23);
		
	}
}
