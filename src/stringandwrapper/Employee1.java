/*Write an Employee class with id, name and dob(Contained Object.. 
Containment)with Default and parameterised constructor & toString()..*/


package stringandwrapper;

class DOB
{
	int d , m ,y;
	DOB(int d, int m, int y)
	{
		this.d = d;
		this.m = m;
		this.y = y;
		
		
	}
	@Override
	public String toString() {
		return "DOB [d=" + d + ", m=" + m + ", y=" + y + "]";
	}
}

class Employee
{
	int id;
	String name;
	DOB d1;	

	public Employee(int id, String name, DOB d1) {
		super();
		this.id = id;
		this.name = name;
		this.d1 = d1;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", d1=" + d1 + "]";
	}
	
	
}

public class Employee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DOB d = new DOB(2,4,2001);
		Employee e = new Employee(101, "Gauri",d);
		System.out.println(e);
		
		

	}

}
