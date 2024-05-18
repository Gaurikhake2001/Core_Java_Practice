/*
 a={7,8,3,1,2}
 
 1st iteration ==> 7,8,3,1,2 : 7,3,8,1,2 :7,3,1,8,2: 7,3,1,2,8
 
 
 2nd iteration ==> 7,3,1,2,8 : 3,7,1,2,8: 3,1,7,2,8: 3,1,2,7,8
 3rd iteration ==> 3,1,2,7,8: 1,3,2,7,8: 1,2,3,7,8 
 4th iteration ==> 1,2,3,7,8 : 1,2,3,7,8
 
 iteration ==> size - 1 ==> 4
 size = 5

 a={7,9,5}
 
 1st iteration ==> 7,9,5 : 7,5,9
 2nd iteration ==> 7,5,9 : 5,7,9
 c=a
 a=b
 b=c
 */
public class BubbleSort {
	public static void PrintArray(int a[])
	{
		for(int i=0 ; i<a.length; i++)
		{
			System.out.println(a[i]+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {7,8,3,1,2};
		for(int i=0 ; i<a.length-1; i++) {
			for(int j=0; j<a.length-i-1; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp =a[j]; 
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
			}
		}
		PrintArray(a);

	}

}
