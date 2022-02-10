package com.comparator.demo;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

	@Override
	public int compare(User user1, User user2) {
		return user1.name.compareTo(user2.name);
	}

}
