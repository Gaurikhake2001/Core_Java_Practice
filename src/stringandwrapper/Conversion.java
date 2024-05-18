package stringandwrapper;
import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter Integer for Conversion: ");
		n = sc.nextInt();
		
//		int to binary
		String b = Integer.toBinaryString(n);
		System.out.println("Integer to binary conversion is: "+ b);
		
//		int to hexadecimal
		String h = Integer.toHexString(n);
		System.out.println("Integer to hexadecimal conversion is: "+ h);
		
//		int to octal
		String o = Integer.toOctalString(n);
		System.out.println("Integer to octal conversion is: "+ o);

	}

}
