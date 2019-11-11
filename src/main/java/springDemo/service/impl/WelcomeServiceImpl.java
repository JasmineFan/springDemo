package springDemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springDemo.dao.UserMapper;
import springDemo.model.User;
import springDemo.service.WelcomeService;
@Service
public class WelcomeServiceImpl implements WelcomeService {

	@Autowired
	private UserMapper userMapper;

	public User getUser(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> getAllUser() {
		return userMapper.selectAll();
	}
	
	@Override
	public void addUser(User user) {
		
		userMapper.insert(user);
	}
}
