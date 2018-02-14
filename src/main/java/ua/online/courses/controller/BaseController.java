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
	
	@GetMapping("/authorization/reg")
	public String registPage() {
		return "authorization/reg";
	}
	
	@GetMapping("/authorization/login")
	public String loginPage() {	
		return "authorization/login";
	}
	
	
}
