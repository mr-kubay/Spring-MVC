package ua.online.courses.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {
	@GetMapping("/users")
	public String showUsers(Model model) {
		
		List<String> users = new ArrayList<>();
		users.add("User1");
		users.add("User2");
		users.add("User3");
		users.add("User4");
		users.add("User5");
		
		model.addAttribute("usersList",users);
		return "users";
	}
	
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
	
	@GetMapping("/items/product")
	public String showBuyList() {
		return "items/product";
	}
	
}
