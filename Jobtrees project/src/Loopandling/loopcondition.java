package Loopandling;

import java.util.Iterator;
import java.util.Scanner;

public class loopcondition 

{
public static void main(String[] args) 

{
//	int a=88;
//	if (a%2==0)
//	{System.out.println("number is even "+ a);
//}
//	else 
//	{System.out.println("number is odd "+ a);
//	
//	}
	
//	System.out.println("please enter value of a ");
//	Scanner s= new Scanner(System.in);
//	int a=s.nextInt();
//	if(a%2==0)
//	{
//		System.out.println("this is even number");
//	}
//		else
//	{
//		System.out.println("Number is odd");
//	}
	
	
//	System.out.println("Please enter value");
//	Scanner sc= new Scanner(System.in);
//	int marks=sc.nextInt();
//	int row=10;
//	if ((marks>0)&&(marks<35)) 
//	{
//		System.out.println("fail..");
//	
//	}
//	else if((marks>=35)&&(marks<=60))
//	{
//		System.out.println("Pass..");
//		
//	}
//	else if ((marks>=60)&&(marks<=80))
//	{
//		System.out.println("First division..");
//		
//	}
//	
//	else if((marks>=80)&&(marks<=100))
//	{
//		System.out.println("Merit");
//	}
//	
//	else
//	{
//		System.out.println("pls enter the correct value");
//		
//		
//	}
	
	
//	
//	int a=0;
//	while (a<5)
//	{
//		System.out.println("value of "+ a);
//	}
	
	
//	int a=0;
//	do
//	{
//		System.out.println("value of "+a);
//		a=a+1;
//	}while (a<10);
	
//	swipe
//	int a=12;
//	int b=15;
//	int temp;
//	
//	temp= a;
//	a=b;
//	b=temp;
//	{
//		System.out.println("After swiping resust is");
//		System.out.println("a= " + a);
//		System.out.println("b= " + b);
//	}
	
//	int a=12;
//	int b=15;
//	
//	a=a+b;
//	b=a-b;
//	a=a-b;
//	
//	System.out.println("a = " + a);
//	System.out.println("b = " + b);
	
	
	
//	int number=5;
//	int factorial =1;
//	
//	for (int i=1; i<=number; i++) {
//		factorial *= i;
//		
//	}
//	System.out.println("Factorial of " + number + " is: " + factorial);
//	System.out.println(factorial);
	
//	Scanner sc = new Scanner(System.in);  
//	System.out.print("Enter number: ");       
//	//reading a number whose table is to be print  
//	int num=sc.nextInt();  
//	//loop start execution form and execute until the condition i<=10 becomes false  
//	for(int i=1; i <= 10; i++)  
//	{  
//	//prints table of the entered number      
//	System.out.println(num+" * "+i+" = "+num*i);  
//}
//	
//	
//	Scanner s= new Scanner(System.in);
//	System.out.println("Enter number: ");
//	int nume=s.nextInt();
//	
//	for (int i=1;  i <=10; i++ )
//	{
//		System.out.println(nume + " * " + i + " = "+ nume * i);
//	}
	
	
	
	
	
//	int a=1;
//	
//	while (a<10)
//		{
//		
//		System.out.println("2 *" + a + " = " + a);
//		a= a+1;
//		
//		}
//	System.out.println("print the value");
//	Scanner s= new Scanner(System.in);
//	int max=s.nextInt();
//	if (max>0)
//	{
//		for(int i=1; i<=max; i=i+1);
//		{
//			System.out.println("Value of it " + 1 );
//			
//		}
//	}
	
//	int rowcount=5;
//	
//	for (int i=1; i<=rowcount; i=i+1)
//		
//	{
//		for (int j=1; j<=rowcount-i; j=j+1)
//		{
//			System.out.print(" ");
//		}
//	
//		for (int k=1; k<=i; k=k+1)
//	    {
//	    	System.out.print("*");
//	    }
//	    System.out.println();
//}

	
//	int rowCount = 5;
//    
//    // Outer loop for the number of rows
//    for (int i = 1; i <= rowCount; i++) {
//        
//        // Inner loop for printing spaces
//        for (int j = 1; j <= rowCount - i; j++) {
//            System.out.print(" ");
//        }
//        
//        // Inner loop for printing stars
//        for (int k = 1; k <= i; k++) {
//            System.out.print("*");
//        }
//        
//        // Move to the next line after printing each row
//        System.out.println();
//    }
	int rowCount = 5;

    for (int i = 1; i <= rowCount; i++) {
        
        // Inner loop for printing spaces
        for (int j = rowCount - i; j > 0; j--) {
            System.out.print(" ");
        }
        
        // Inner loop for printing stars
        for (int k = 1; k <= (2 * i - 1); k++) {
            System.out.print("*");
        }
        
        // Move to the next line after printing each row
        System.out.println();
    }
}
}

	



