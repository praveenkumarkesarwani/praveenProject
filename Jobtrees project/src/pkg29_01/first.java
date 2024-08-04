package pkg29_01;

public class first extends second
{public void method1()
	{
	System.out.println("child default parametrized");
	}
public void method2(int a)
{
	System.out.println("child one parametrized constructor");
	
}
public void method3(int a,int b)
{super.method5();
super.method7(1,2);
super.method6(2);
super.method8(1,2,3);
	System.out.println("child two parametrized constructor");
}
public void method4(int a,int b,int c)
{
	this.method3(6,7);
    this.method1();
    this.method2(5);
	System.out.println("child three parametrized constructor");
}
public static void main(String[] args) {
	first obj=new first();
	obj.method4(2,3,4);
}
}
