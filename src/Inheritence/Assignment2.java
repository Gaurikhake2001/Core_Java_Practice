package Inheritence;

import java.util.Scanner;

class Employee //Parent class
{
	int d, m ,y;
	String name;
	String add;
	
	Employee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date of birth , name and address: ");
		d = sc.nextInt();
		m = sc.nextInt();
		y = sc.nextInt();
		name = sc.next();
		add = sc.next();
		
		System.out.println("Date of Birth: "+ "("+d+"/"+m+"/"+y+")"+" "+ "Name: "+name+" "+
		"Address: "+add);
		
	}

}
class WageEmployee extends Employee //child class
{
	int hrs, rate;
	
	void getdetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hrs that employee work for: ");
		hrs = sc.nextInt();
		System.out.println("Enter rate of work per hour: ");
		rate = sc.nextInt();
		
	}
	
	void ComputeSalary()
	{
		int salary = rate * hrs;
		System.out.println("Hours are "+hrs+" "+ "and Rate is " +
		rate+ " "+"for this your salary is: "+salary);
	}
	
}
class SalesPerson extends WageEmployee
{
	int sales;
	int commission;
	int fixedsal;
	void getdetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sales u have done: ");
		sales = sc.nextInt();
		System.out.println("Enter your fixed salary: ");
		fixedsal = sc.nextInt();
		System.out.println("Enter your commission: ");
		commission = sc.nextInt();
	}
	
	void ComputeSalary()
	{
		int Salary = fixedsal + commission;
		
		System.out.println("Your Salary is: "+Salary);
	}
}

class Manager extends Employee
{
	int fixedsal, incentives;
	
	void getdetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your fixed salary: ");
		fixedsal = sc.nextInt();
		System.out.println("Enter Your Incentives: ");
		incentives = sc.nextInt();
	}
	void ComputeSalary()
	{
		int Salary = fixedsal + incentives;
		
		System.out.println("Your salary is :"+Salary);
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WageEmployee w = new WageEmployee();
		w.getdetails();
		w.ComputeSalary();
		
		SalesPerson s = new SalesPerson();
		s.getdetails();
		s.ComputeSalary();
		
		Manager m = new Manager();
		m.getdetails();
		m.ComputeSalary();

	}

}
