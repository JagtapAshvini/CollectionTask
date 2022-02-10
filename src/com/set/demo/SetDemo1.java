package com.set.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
	
	public static void main(String[] args) {
		
		Collection<String> collection=new ArrayList<>();
		collection.add("a");
		collection.add("a");
		collection.add("b");
		
		Set<String> set=new HashSet<>(collection);
		System.out.println(set);
	}

}
