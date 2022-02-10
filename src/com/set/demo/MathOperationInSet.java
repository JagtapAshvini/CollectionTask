package com.set.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MathOperationInSet {
	
	public static void main(String[] args) {
		
		Set<String> set1=new HashSet<>(Arrays.asList("a","b","c"));
		
		Set<String> set2=new HashSet<>(Arrays.asList("b","c","d"));
		
		//set1.retainAll(set2);           //performs Intersection operation that means common in 2 sets.
		//System.out.println(set1);
		
		//set1.addAll(set2);             //performs Union operation.
		//System.out.println(set1);
		
		set1.removeAll(set2);
		System.out.println(set1);
	}

}
