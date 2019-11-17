package springDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import springDemo.model.User;
import springDemo.service.WelcomeService;
@Controller
@RequestMapping("rest")
public class RestStyleController {


	@Autowired
	WelcomeService welcomeService;
	
	@ResponseBody
	@RequestMapping(value = "user/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable Integer id){
		
		User user = welcomeService.getUser(id);
		
		return user;
	}
	
	@ResponseBody
	@RequestMapping(value = "user", method = RequestMethod.PUT)
	public String updateUser(@RequestBody User user){
		
		welcomeService.updateUser(user);
		
		return "{\"status\": \"success\"}";
	}
	
	@ResponseBody
	@RequestMapping(value = "user", method = RequestMethod.POST)
	public String addUser(@RequestBody User user){
		
		welcomeService.addUser(user);
		
		return "{\"status\": \"success\"}";
	}
	
	@ResponseBody
	@RequestMapping(value = "user/{id}", method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable Integer id) {
		
		welcomeService.deleteUser(id);
		
		return "{\"status\": \"success\"}";
	}
}
