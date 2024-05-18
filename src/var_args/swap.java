package var_args;
class Demo
{
	
	void swap (int a,int b)
	{
//		int a=10, b=20;
		System.out.println("Before Swapping Numbers: "+ a+" " + b );	
	
		a = a+b;
		b= a-b;
		a =a-b;
		
		System.out.println("After Swapping Numbers: "+ a +" "+ b );	
	}
	
	void swap(char x , char y)
	{
	
		System.out.println("Before Swapping characters: "+ x+" " + y );	
	
		char t;
		t = x;
		x=y;
		y = t;
		
		System.out.println("After Swapping characters: "+ x +" "+ y );	
		
		
	}
}

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d = new Demo();
		d.swap(1, 2);
		d.swap('a', 'b');

	}

}
