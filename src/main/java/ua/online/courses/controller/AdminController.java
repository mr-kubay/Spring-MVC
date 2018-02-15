package ua.online.courses.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {


	@GetMapping("/dashboard")
	public String showAdminDashboard(Model model) {
		model.addAttribute("title", "Admin dashboard title");
		return "admin/dashboard";
	}
	
	@GetMapping("/adminHomePage")
	public String showAdminHomePage() {
		return "admin/adminHomePage";
	}
	
	@GetMapping("/items")
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
		return "admin/items";
	}
	@GetMapping("items/{itemName}")
	public String showOneItem(Model model, @PathVariable("itemName") String name) {
		model.addAttribute("item1", name);
		return "items/product";
	}
	
	@GetMapping("/items/{itemName}/edit")
	public String editItem() {
		return "items/edit";
	}
	
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
	
	@GetMapping("user/{userName}/profile/sendmail")
	public String userSendMail(Model model, @PathVariable("userName") String name) {
//		model.addAttribute("name", name);
		return "user/sendmail";
	}
	
	
	@GetMapping("user/{userName}/profile/block")
	public String blockUser(Model model,@PathVariable("userName") String name) {
//		model.addAttribute("name",name);
		return "user/blockUser";
	}
}
