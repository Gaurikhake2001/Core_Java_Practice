package abstract_keyword;

import java.util.Scanner;

 class Medicine 
{
	public void displayLabel()
	
{
		String nm,add;
		Scanner sc = new Scanner (System.in);
	System.out.println("Enter Name of Company:");
	nm = sc.next();
	System.out.println("Enter Address of Company: ");
	add = sc.next();
	}
	}
class Tablet extends Medicine{
	public void displayLabel()
	{
		System.out.println("store in a cool dry place");
		}
	}
class Syrup extends Medicine
{
	public void displayLabel()
	{
		System.out.println("shake well before use");
		}
	}
class Ointment extends Medicine
{
	public void displayLabel()
	{
		System.out.println("for external use only");
}
}


public class Medicine1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}

