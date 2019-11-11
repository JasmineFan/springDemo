package springDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import springDemo.model.User;
import springDemo.service.WelcomeService;

@Controller
public class WelcomeController {

	@Autowired
	WelcomeService welcomeService;
	
	@RequestMapping("user")
	public String getUser(int id, Model model){
			
		User user = welcomeService.getUser(id);
		model.addAttribute("user", user);
	
		return "user";
	}
	
	@RequestMapping("user/{id}")
	public String getUserRest(Integer id, ModelMap model){
		
		User user = welcomeService.getUser(id);
		model.put("user", user);

		return "user";
	}
	
	@RequestMapping("regster")
	public String gotoRegister() {
		return "userRegister";
	}
	
	@RequestMapping("userList")
	public String userList(ModelMap model) {
		
		model.put("list", welcomeService.getAllUser());
		return "userList";
	}
	
	@RequestMapping("doRegister")
	public String doRegister(User user, ModelMap model) {
		
		welcomeService.addUser(user);
		model.put("list", welcomeService.getAllUser());
		return "userList";
	}
	
//	@RequestMapping("user/{id}", RequestMethod.)
//	public String getUserRest(int id, ModelMap model){
//		
//		User user = welcomeService.getUser(id);
//		model.put("name", user.getUsername());
//
//		return "user";
//	}
}
