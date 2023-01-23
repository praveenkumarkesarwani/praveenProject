package pkg1;

public class classA1 {
	
    public classA1() {
	this (3,4,5);
	System.out.println("default parameter constructor");
    }
    public classA1(int a) {
	this ();
	System.out.println("one parameter constructor");
    }
    public classA1(int a, int b) {
	this (7,4,6,9);
	System.out.println("two parameter constructor");
    }
    public classA1(int a, int b, int c) {
	System.out.println("three parameter constructor");
    }
    public classA1(int a,int b, int c,int d) {
	this (99);
	System.out.println("four parameter constructor");
    }
    public static void main(String[] args) {
		@SuppressWarnings("unused")
		classA1 obj=new classA1(5,4);
	}
}


