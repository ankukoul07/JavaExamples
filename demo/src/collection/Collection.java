package collection;

import java.util.ArrayList;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> mylist=new ArrayList<>(5);
		mylist.add(5);
		mylist.add(10);
		
		System.out.println("size is:"+mylist.size());
		for(Integer I:mylist)
			System.out.println(I);
		
		mylist.add(20);
		System.out.println("size is:"+mylist.size());
		
		for(Integer I:mylist)
			System.out.println(I);
		
		
		
	}

}
