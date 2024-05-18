/*Write program to create array of employee object, and print all employee 
information*/


package stringandwrapper;
import java.util.*;

class Employee3
{
	int id;
	String name;
	String Address;
	float Salary;
	long mobnm;
	void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id: ");
		id = sc.nextInt();
		System.out.println("Enter Name: ");
		name = sc.next();
		System.out.println("Enter Address: ");
		Address = sc.next();
		System.out.println("Enter Mobile No.: ");
		mobnm = sc.nextLong();
		System.out.println("Enter Salary: ");
		Salary = sc.nextFloat();
	}
	void display()
	{
		
		System.out.println("Details are: " + "  "+ "Id = "+ id+ " " + "Name = "+ name+ " "+ "Address ="+ Address+ " "+" Mobile No= "+ mobnm +" "+ "Salary = "+ Salary);
	}
	
}

public class Employee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee3 e[] = new Employee3[2];
		for(int i=0 ; i<2 ; i++)
		{
			e[i] = new Employee3();
			e[i].accept();
			e[i].display();
		}

	}

}
