package pkg1;

import java.util.Scanner;

public class inheritage 
    {
    private static final String p = null;
	public int sum(int a,int b) {
    int sum=a+b;
    System.out.println("result of sum"+sum);
    return sum;
    }
    
	public int sub(int a,int b) {
	int sub=a-b;
	System.out.println("result of sub"+sub);
	return sub;
    }
	public int multi(int a,int b) {
	int multi=a*b;
	System.out.println("result of multi"+multi);
	return multi;
	}
	
	public int div(int a,int b) {
	int div=a/b;
	System.out.println("result of div"+div);
	return div;
	
     }
    public static void main(String[] args) {
		{Scanner s=new Scanner(System.in);
		System.out.println("please enter value for sum");
		int x1=s.nextInt();
		int x2=s.nextInt();
		System.out.println("please enter value for sub");
		int x3=s.nextInt();
		int x4=s.nextInt();
		}
    }
}
		
	
//           ((((x1+x2)+x3)-x4)/x5)*x6)



