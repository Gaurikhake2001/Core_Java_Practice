package var_args;

class Add1
{
	void add1(int...x)
	{
		int sum = 0;
		for(int i:x)
		{
			sum = sum+i;
			
		}
		System.out.println("Sum of Int = "+ sum);
	}
	
	void add2(float...x)
	{
		float sum = 0;
		for(float i:x)
		{
			sum = sum + i;
			
		}
		System.out.println("Sum of Float ="+ sum);
	}
}

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Add1 a = new Add1();
		
		a.add1(10,20,30,40,50,60,70,80,90);
        a.add2(4.5f,5.6f,7.8f,9.0f);		

	}

}
