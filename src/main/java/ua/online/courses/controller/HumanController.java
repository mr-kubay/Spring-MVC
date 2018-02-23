package ua.online.courses.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.online.courses.entity.Human;
import ua.online.courses.service.HumanService;


@Controller
@RequestMapping("/human")
public class HumanController {

	@Autowired
	private HumanService hserv;
	
	@GetMapping("/form")
	public String getForm(Model model) {
		model.addAttribute("humanModel", new Human());
		return "human/form";
	}
	
	@PostMapping("/form")
	public String postForm(@ModelAttribute("humanModel") @Valid Human human, BindingResult result) {
		
		if(result.hasErrors()) {
			return "human/form";
		}
		
		hserv.saveHuman(human);
		return "redirect:/";
	}
}