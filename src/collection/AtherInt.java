package collection;
import java.util.*;
public class AtherInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);
		System.out.println(l);
		
		
		for(int i = 0; i < l.size(); i++) 
		{
            if (l.get(i) % 2 == 0) 
            {
                l.remove(i);

	        }
        }
		System.out.println(l);
		
		var li = l.iterator();	
		while(li.hasNext())
		{
			var n = li.next();
			if(n%2 != 0);
			li.remove();
				
		}
		System.out.println(l);
	
	}
}
