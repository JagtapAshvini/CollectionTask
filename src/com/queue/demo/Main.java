package com.queue.demo;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
	
	public static void main(String[] args) {
		
		Queue<String> q=new ArrayDeque<>();
		q.add("a");
		q.add("b");
		q.add("c");
		
		System.out.println(q);
		
		String front=q.peek();          //return null if queue is empty
		System.out.println(front);
		
		String front1=q.element();     //throws exception if queue is empty
		System.out.println(front1);
		
		String rm=q.remove();
		System.out.println(rm);       //throws exception if queue is empty
		
		String p=q.poll();
		System.out.println(p);       //return null if queue is empty
		
		System.out.println(q);
		q.offer("x");
		q.offer("y");
		q.offer("z");
		System.out.println(q);
	}

}
