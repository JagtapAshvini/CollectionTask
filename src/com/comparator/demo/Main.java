package com.comparator.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<User> lst=new ArrayList<User>();
		lst.add(new User(101,"Ashvini",800000));
		lst.add(new User(102,"Sandhya",700000));
		lst.add(new User(103,"Rhushi",900000));
		
		Collections.sort(lst,new UserComparator());
		
		for(User u:lst) {
			System.out.println("ID"+u.getUserId()+"\nName "+u.getName()+"\nSalary "+u.getSalary());
		}
	}

}
