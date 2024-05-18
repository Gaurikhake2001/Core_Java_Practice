import java.util.Scanner;
public class BubbleSort1 {
	public static void PrintArray(int a[])
			{
		for(int i=0 ; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of a array: ");
		int size  = s.nextInt();
		int a[] = new int[size];
//		enter array elements
		System.out.println("Enter an array elements: ");
		for(int i=0 ; i<size ; i++)
		{
			a[i] = s.nextInt();
		}
		
//		sort array elements
		
		for(int i=0; i<size-1; i++)
		{
			for(int j=0; j<size-1-i; j++)
			{
//				swap
				
				if(a[j] < a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		PrintArray(a);

	}

}
