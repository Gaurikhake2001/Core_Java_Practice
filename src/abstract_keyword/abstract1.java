package abstract_keyword;

abstract class Demo
{
	Demo()
	{
		System.out.println("In Default Constructor!!");
	}
	void get()
	{
		System.out.println("In get()");
	}
	
	abstract void display();
}
class Demo1 extends Demo
{
	void display()
	{
		System.out.println("In display()");
	}
}

public class abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d = new Demo1();
		d.get();
		d.display();
		

	}

}
