package classes_objects;
import java.util.Scanner;

class Number
{
	int n;
	int fact = 1;
	void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
	}
	void put()
	{
		for(int i=1; i<=n; i++)
		{
		fact = fact*i;
		}
		System.out.println("Factorial of "+n+ "is : "+fact);
	}
}

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number n = new Number();
		n.get();
		n.put();

	}

}
