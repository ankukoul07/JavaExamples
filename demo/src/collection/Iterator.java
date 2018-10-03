package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
	
				ArrayList<Integer> mylist=new ArrayList<>(5);
				mylist.add(5);
				mylist.add(10);
				
				ListIterator<Integer> li=mylist.listIterator();
				
				while(li.hasNext())
					System.out.println("List is:"+li.next());
				
				while(li.hasPrevious())
					System.out.println("Reverse List is:"+li.previous());
				
				
				
	}

}
