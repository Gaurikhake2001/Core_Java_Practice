/*Create an interface
interface MyMath
{
 double sqr(double a);
 double cube(double a);
 double cosine(double a);
 double sine(double a);
}
40
Lab Manual
Write a class implMath which implements MyMath interface.
Write another class MathDemo ..In main create a reference of MyMath pointing 
to implMath class and invoke the methods..Accept the values from the user..*/


package interfacepkg;

interface MyMath
{
	double sqr(double a);
	 double cube(double a);
	 double cosine(double a);
	 double sine(double a);
}

class ImplMath implements MyMath
{

	@Override
	public double sqr(double a) {
		// TODO Auto-generated method stub
		System.out.println(a*a);
		return 0;
	}

	@Override
	public double cube(double a) {
		// TODO Auto-generated method stub
		System.out.println(a*a*a);
		return 0;
	}

	@Override
	public double cosine(double a) {
		// TODO Auto-generated method stub
		System.out.println(Math.cos(a));
		
		return 0;
	}

	@Override
	public double sine(double a) {
		// TODO Auto-generated method stub
		System.out.println(Math.sin(a));
		return 0;
	}
	
}

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyMath m = new ImplMath();
		 m.sqr(10);
		 m.cube(10);
		 m.cosine(10);
		 m.sine(10);

	}

}
