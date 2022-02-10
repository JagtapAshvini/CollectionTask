package com.map.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<String,Customer> map=new HashMap<>();
		
		Customer c1=new Customer(101,"A","e1@gmail.com");
		Customer c2=new Customer(102,"B","e2@gmail.com");
		Customer c3=new Customer(103,"C","e3@gmail.com");
		
		map.put(c1.getEmail(), c1);
		map.put(c2.getEmail(),c2);
		map.put(c3.getEmail(), c3);
		
		Set<Map.Entry<String,Customer>> set=map.entrySet();
		for(Map.Entry<String, Customer> m:set) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}

}
