package ua.online.courses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {


	@GetMapping("/admin/dashboard")
	public String showAdminDashboard(Model model) {
		model.addAttribute("title", "Admin dashboard title");
		return "admin/dashboard";
	}
	
	@GetMapping("/admin/adminHomePage")
	public String showAdminHomePage() {
		return "admin/adminHomePage";
	}
}
