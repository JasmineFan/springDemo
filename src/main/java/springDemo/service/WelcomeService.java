package springDemo.service;

import java.util.List;

import springDemo.model.User;

public interface WelcomeService {

	public void addUser(User user);
	
	public User getUser(int id);
	
	public List<User> getAllUser();
}
