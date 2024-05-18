/*Write a program to test add(),get(),size(),isEmplty(),iterator(),remove() functions 
with basic collection APIs(List,Set)*/

package collection;

import java.util.*;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = new ArrayList<Integer>();
//		add()
		l.add(9);
		l.add(25);
		l.add(null);
		l.add(29);
		System.out.println(l);
		
//		get()
		System.out.println(l.get(3));
		
//		size()
		System.out.println(l.size());
		
//		isEmpty()
		System.out.println(l.isEmpty());
		
//		rempve()
		System.out.println(l.remove(3));
		System.out.println(l);
		
		ListIterator li = l.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		
		
		
		
	}

}
