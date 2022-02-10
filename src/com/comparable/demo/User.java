package com.comparable.demo;

public class User implements Comparable<User> {

	private int userId;
	private String name;
	private int salary;
	
	
	
	public User(int userId, String name, int salary) {
		this.userId = userId;
		this.name = name;
		this.salary = salary;
	}

    

	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", salary=" + salary + "]";
	}



	@Override
	public int compareTo(User obj) {
		if(salary==obj.salary) {
			return 0;
		}else if(salary > obj.salary) {
		     return 1;	
		}else {
			return -1;
		}
	}

}
