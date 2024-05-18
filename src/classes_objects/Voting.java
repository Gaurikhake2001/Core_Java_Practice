package classes_objects;

import java.util.Scanner;

class Person
{
	int age;
	void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of a Person: ");
		age = sc.nextInt();
		
	}
	void display()
	{   
		System.out.println("age = "+age);
		if(age>=18)
			System.out.println("Person is Eligible for Voting!");
		else
			System.out.println("Person is not Eligible for Voting!");
		
		
	}
}

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		Person p2 = new Person();
		p1.accept();
		p1.display();
		p2.accept();
		p2.display();

	}

}
