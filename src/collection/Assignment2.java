/*3.Write a Menu Driven program to do following 
To Add elements into Arraylist
To retrieve an element (at a specified index) from a given array list
Toinsert an element into the array list at the first position
To update specific array element by given element.
To remove element from given position
To Search element in an arraylist
To reverse element of an arraylist
To sort element of an arraylist*/

package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = new ArrayList<Integer>();
		
//		add elements in arraylist
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);
		System.out.println(l);
		
//		retrieve element at certain index
		
		System.out.println(l.get(0));
		
//		insert element at certain index
		
		l.set(1, null);
		System.out.println(l);
		
//		update element 
		
		l.set(3, 35);
		System.out.println(l);
		
//		remove
		
		System.out.println(l.remove(null));
		System.out.println(l);
		
//		check 
		System.out.println(l.contains(null));
		
//		seaarch
		
		System.out.println(l.indexOf(20));
		
//		reverse
		Collections.reverse(l);
		System.out.println(l);
		
//		sort
		Collections.sort(l);
		System.out.println(l);
		
		l.sort(null);
		System.out.println(l);
		
		
		
		
		
		

	}

}
