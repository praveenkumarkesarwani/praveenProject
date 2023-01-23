package pkg1;

public class Maths1 
{
   public int div(int a,int b)
   {int c=a/b;
   System.out.println("div result is"+c);
   return c;
	   
   }
   public int sub(int a1,int b2)
   {int d=a1-b2;
   System.out.println("sub result is"+d);
   return d;
   }
   public int sum(int a3,int b3)
   {int e=a3+b3;
   System.out.println("sum result is"+e);
   return e;
   }
   public int multi(int a4,int b4)
   {int f=a4*b4;
   System.out.println("multi result is"+f);
   return f;
   }
   public static void main(String[] args) 
   {
	   Maths1 obj=new Maths1();
	   int divresult=obj.div(10,2);
	   int subresult=obj.sub(divresult,2);
	   int sumresult=obj.sum(subresult,2);
	   int subresult2=obj.sub(sumresult,2);
	   int multiresult=obj.multi(subresult2,2);
	   
	   System.out.println("(((((10/2)-2)+2)-2)*2)="multiresult);
}
   
}

