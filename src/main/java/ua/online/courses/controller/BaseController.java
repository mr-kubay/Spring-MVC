package ua.online.courses.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BaseController {


	@GetMapping("/")
	public String showHome(Model model) {
		
		return "home";
	}
	
	@GetMapping("/reg")
	public String registPage() {
		return "reg";
	}
	
	@GetMapping("/login")
	public String loginPage() {	
		return "login";
	}
	
	@GetMapping("/items/items")
	public String showItems(Model model) {
		List<String> items = new ArrayList<>();
		items.add("Sneakers");
		items.add("Polo");
		items.add("Shirt");
		items.add("Jeans");
		items.add("Boots");
		items.add("Hat");
		items.add("Snapback");
		
		model.addAttribute("itemsList" , items);
		return "items/items";
	}
	
	@GetMapping("items/{item1}")
	public String showProduct(Model model, 
			@PathVariable("item1") String item) {
		model.addAttribute("item1", item);
		return "items/product";
	}
	
	@GetMapping("/user/users")
	public String showUsers(Model model) {
		
		List<String> users = new ArrayList<>();
		users.add("User1");
		users.add("User2");
		users.add("User3");
		users.add("User4");
		users.add("User5");
		
		model.addAttribute("usersList",users);
		return "user/users";
	}
	
	@GetMapping("user/{userName}")
	public String showUserInfo(Model model, @PathVariable("userName") String name) {
		model.addAttribute("userName",name);
		return "user/userInfo";
	}

}
