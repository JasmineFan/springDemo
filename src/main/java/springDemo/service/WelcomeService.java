package springDemo.service;

import java.util.List;

import springDemo.model.User;

public interface WelcomeService {

	public int addUser(User user);
	
	public User getUser(int id);
	
	public int deleteUser(int id);
	
	public int updateUser(User user);
	
	public List<User> getAllUser();
}
