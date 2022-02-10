package om.collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		
		Collection<Integer> collection = new ArrayList<>();
		collection.add(10);
		collection.add(20);
		collection.add(30);
		
		Collection<Integer> list=new ArrayList<>();
		list.add(40);
		list.add(50);
		
		collection.addAll(list);
		
		Iterator itr=collection.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
	
	
}
