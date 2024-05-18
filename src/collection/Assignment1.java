/*Write a Java program to create a new array list, add some colors (string) and print 
out the collection(use iterator() and foreach() for printing elements).*/

package collection;
import java.util.*;

public class Assignment1 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l = new ArrayList<String>();
		
		l.add("Red");
		l.add("Black");
		l.add("Yellow");
		l.add("Green");
		l.add("Purple");
		l.add("White");
		System.out.println(l);
		
		

		Object o[] = l.toArray();
		for(Object i:o)
		{
			System.out.println(i);
		}
		
		ListIterator<String> li = l.listIterator() ;
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		
		
		

	}

}
