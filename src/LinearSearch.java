import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter array elemnts: ");
		
//		accepting an array element
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter an item to be searched in an array:");
		int item = sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]==item)
			{
				System.out.println("Item is found at index: "+ i);
			}
		}

	}

}
