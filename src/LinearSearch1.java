import java.util.*;
public class LinearSearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
//		accepting values from user
		System.out.println("Enter elements into an array: ");
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("Enter an item to be searched: " );
		int item = sc.nextInt(); //1,2,3,4,5 
		
		int temp =0;
		
		for(int i=0;i<size;i++)
		{
			if(arr[i] == item)
			{
				System.out.println("item is found at index: "+i);
				temp= temp+1;
			}
			
		}
		if(temp==0)
		{
			System.out.println("item is not present");
		}
		

	}

}















//5,8,9,10,56  linear search
//1,2,3,4,5,6,7,8,9,10,11  binary search

/*
item = 7
first = 0;
last = (n-1)==> 10
middle = first + last / 2 ===> 0+10/2 ==> 5 

if(middle == item)
item is found at middle index;
else if(middle<item) //7,8,9,10,11 ==> 0+4/2==>2 middle=9
first = middle +1;
else(middle>item) //7,8 ==>0+1/2==>1/2
last = middle-1;



 
 






*/






