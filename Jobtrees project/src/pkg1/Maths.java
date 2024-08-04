package pkg1;

public class Maths 
//((((10+2)+2)-2)*2)/2)=
{
  public int sum(int a,int b)
  { int c=a+b;
  System.out.println("result of sum"+ c);
  return c;	
  }
  public int sub(int a1,int b1)
  { int c1=a1-b1;
  System.out.println("result of sub"+ c1);
  return c1;
  }
  public int multi(int a2,int b2)
  {
    int c2=a2*b2;
  System.out.println("return of multi"+ c2);
  return c2;
  }
	public int div(int a3,int b3)
	{ int c3=a3/b3;
	System.out.println("return of div"+ c3);
	return c3;
		
	}
	public static void main(String[] args) 
	{
		Maths obj=new Maths();
		int sumresult=obj.sum(10, 2);
		int sumresult2=obj.sum(sumresult, 2);
		int subresult=obj.sub(sumresult2, 2);
		int multiresult=obj.multi(subresult,2);
		int divresult=obj.div(multiresult,2);
		System.out.println("((((10+2)+2)-2)*2)/2)="+ divresult);
	}
}
		
