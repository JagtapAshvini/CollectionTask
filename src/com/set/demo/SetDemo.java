package com.set.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
		Set<String> set=new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("a");
		
		System.out.println(set);
	}

}
