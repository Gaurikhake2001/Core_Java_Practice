import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size =sc.nextInt();
		
		int marks[] = new int[size];
//		accepting array elements
		System.out.println("Enter elements in an array:");
		for(int i=0; i<size; i++)
		{
			marks[i] = sc.nextInt();
		}
//display array elements
		System.out.println("Array elements are:");
		for(int i=0; i<size; i++)
		{
			System.out.println(marks[i]);
		}
	}

}
