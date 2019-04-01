package super_Method;

public class ClassB extends ClassA {
int  x=20;
public void display()
{
	//System.out.println(x);
	System.out.println(super.x);
}

public void m1()
{
	System.out.println("Method inside SubClass");
}
}
