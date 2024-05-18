package basic;

import java.util.Scanner;
public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		int month;
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter year: ");
		 year = sc.nextInt();
		 System.out.println("Enter month: ");
		 month = sc.nextInt();
		 
		
		 
		 if((year%400==0) && (year%4==0) || (year%100!=0))
		 {
			 if(month == 2)
				 System.out.println("There are 29 days in a month!");
			 else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				 System.out.println("Thereare 31 days in a month");
			else if(month == 4 || month == 6 || month == 9 || month == 11)
				System.out.println("There are 30 days in a month");
			else
				System.out.println("There is only 12 months present in a year");
				
		 }
		 else
		 {
			 if(month == 2)
				 System.out.println("There are 28 days in a month!");
			 else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				 System.out.println("There are 31 days in a month");
			else if(month == 4 || month == 6 || month == 9 || month == 11)
				System.out.println("There are 30 days in a month");
			else
				System.out.println("There is only 12 months present in a year");
		 }
			 
		 

	}

}