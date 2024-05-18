package Inheritence;
import java.util.Scanner;


class WageEmployee1
{
	int id;
	String name;
	float Salary;
	void get()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id , name , salary: ");
		id = sc.nextInt();
		name = sc.next();
		Salary = sc.nextFloat();
		
	}
	void put()
	{
		System.out.println("Id: "+id+ "Name: "+name+"Salary: "+Salary);
	}
}
class SalesPerson1
{
	int id;
	String name;
	float Salary;
	void get()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id , name , salary: ");
		id = sc.nextInt();
		name = sc.next();
		Salary = sc.nextFloat();
		
	}
	void put()
	{
		System.out.println("Id: "+id+ "Name: "+name+"Salary: "+Salary);
	}
}
class Manager1
{
	int id;
	String name;
	float Salary;
	void get()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id , name , salary: ");
		id = sc.nextInt();
		name = sc.next();
		Salary = sc.nextFloat();
		
	}
	void put()
	{
		System.out.println("Id: "+id+ "Name: "+name+"Salary: "+Salary);
	}
}
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WageEmployee1 w[] = new WageEmployee1[2];
		System.out.println("Wage Employee's Details are: ");
		for(int i=0 ; i<2 ; i++)
		{
			w[i] = new WageEmployee1();
			w[i].get();
			w[i].put();
		}
		
		SalesPerson1 s[] = new SalesPerson1[2];
		System.out.println("Sales Person's Details are: ");
		for(int i=0 ; i<2 ; i++)
		{
			s[i] = new SalesPerson1();
			s[i].get();
			s[i].put();
		}
		Manager1 m[] = new Manager1[2];
		System.out.println("Manager's Details are: ");
		for(int i=0 ; i<2 ; i++)
		{
			m[i] = new Manager1();
			m[i].get();
			m[i].put();
		}

	}

}
