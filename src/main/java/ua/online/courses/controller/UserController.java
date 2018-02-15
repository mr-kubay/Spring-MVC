package ua.online.courses.controller;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.online.courses.entity.User;
import ua.online.courses.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("user/{userName}")
	public String showUserInfo(Model model, @PathVariable("userName") String name) {
		model.addAttribute("userName",name);
		return "user/userInfo";
	}
	
	@GetMapping("/user/{userName}/profile")
	public String showProfile(Model model, @PathVariable("userName") String name) {
		model.addAttribute("name", name);
		return "user/profile";
	}
	
	@GetMapping("/user/{userName}/profile/edit")
	public String showEditMenu() {
		return "user/edit";
	}

	@GetMapping("user/add")
	public String addUserPage() {
		return "user/add-user";
	}
	
	@GetMapping("user/list")
	public String showUsersPage(Model model) {
		model.addAttribute("userList", userService.findAllUsers());
		return "user/show-users";
	}
	
	@PostMapping("user/add")
	public String addUser(
			@RequestParam("firstName") String name,
			@RequestParam("lastName") String surname
			) {
		
		User user = new User();
		user.setFirstName(name);
		user.setLastName(surname);
		
		userService.saveUser(user);
		return "redirect:/user/list";
	}
	
	
}
