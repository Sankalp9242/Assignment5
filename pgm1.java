package java_Assignment;
/*
 * Write a Java program to invoke parent class constructor from a child class. Create
Child class object and parent class constructor must be invoked. Demonstrate by
writing a program. Also explain key points about Constructor.

 */
class Parent
{
	public Parent() 
	{
		System.out.println("i am a parent class constructor");
	}
}
class Child extends Parent
{
	public Child() 
	{
		//if u dont write super method here then also compiler add default
		//super meth with 0 args.
		super();//optional 
		System.out.println("i am a child classs constructor");
	}
}
public class pgm1
{
	public static void main(String[] args) 
	{
		Child c=new Child();
	}
}
