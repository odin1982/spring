package org.spring.service;

import org.springframework.stereotype.Component;

@Component
//to specify a custom name @Component('anAmazingUserService')
public class UserService {
	public int findNumberOfUsers() {
		return 10;
	}
}
