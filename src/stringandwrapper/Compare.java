package stringandwrapper;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "xyz";
		String s2 = "xyz";
		String s3 = new String ("abc");
		String s4 = new String("Abc");
		
		if(s1 == s2)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		
		System.out.println("comparison for s3 and s4 is: "+ s3.equals(s4));

	}

}
