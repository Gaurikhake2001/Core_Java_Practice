
public class BinarySearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		 int item = 7;
		 int first = 0;
		 int last = arr.length-1;
		 int middle = first+last/2;
		 int temp=0;
		 
		while(first<=last) {
		 if(arr[middle] == item)
		 {
			 System.out.println("item is found at :"+middle);
			 temp = temp + 1;
			 break;
			 
		 }
		 else if(arr[middle]<item)
		 {
			 first = middle+1;
		 }
		 else if(arr[middle]>item)
		 {
			 last = middle-1;
		 }
		 middle =first+last/2;
	  }
		if (temp == 0)
		{
			System.out.println("item is not found");
		}

	}

}
