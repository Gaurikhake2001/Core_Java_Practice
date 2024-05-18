package constructors;

//import java.util.Scanner;

class Constructor
{
	int acno;
	String name;
	Constructor()
	{
	    acno = 789456123;
		name = "Suresh Kelkar";
	}
	Constructor(int acno , String name)
	{
		this.acno = acno;
		this.name = name;
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c = new Constructor();
		Constructor c1 = new Constructor(321654987 , "Rajesh Kelkar");
		System.out.println(c);
		System.out.println(c1);

	}

}

