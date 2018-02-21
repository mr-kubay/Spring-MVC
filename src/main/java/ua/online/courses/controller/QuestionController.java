package ua.online.courses.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.online.courses.entity.Questionairre;
import ua.online.courses.enums.Degree;
import ua.online.courses.enums.Gender;
import ua.online.courses.enums.ProfRank;
import ua.online.courses.service.QuestionService;

@Controller
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	@GetMapping("/quiz")
	public String showQuizPage(Model model) {
		LinkedHashMap<Integer, String> ages = new LinkedHashMap<>();
		for(int i = 15;i<=60;i++) {
			ages.put(i, new Integer(i).toString());
		}
		
		HashMap<String,String> countries = new LinkedHashMap<>();
		countries.put("USA", "United States");
		countries.put("GE", "Germany");
		countries.put("GB", "Great Britain");
		countries.put("FR", "France");
		countries.put("UA", "Ukraine");
		
		List<String> os = new ArrayList<>();
		os.add("MS Windows");
		os.add("Mac OS");
		os.add("Linux");
		
		List<String> socNetworks = new ArrayList<>();
		socNetworks.add("facebook");
		socNetworks.add("Google");
		socNetworks.add("Instagram");
		
		List<String> favoritelang = new ArrayList<>();
		favoritelang.add("Java");
		favoritelang.add("C++");
		favoritelang.add("Python");
		
		Map<String,String> experience = new LinkedHashMap<>();
		experience.put("1-2", "1-2");
		experience.put("2-3", "2-3");
		experience.put("3-5", "3-5");
		experience.put("5+", "5+");
		
		List<String> technologies = new ArrayList<>();
		technologies.add("Css");
		technologies.add("JS");
		technologies.add("SQL");
		technologies.add("Spring");
		
		model.addAttribute("techs", technologies);
		model.addAttribute("ranks", ProfRank.values());
		model.addAttribute("exps", experience);
		model.addAttribute("favs", favoritelang);
		model.addAttribute("socNets", socNetworks);
		model.addAttribute("os",os);
		model.addAttribute("degree", Degree.values());
		model.addAttribute("gender", Gender.values());
		model.addAttribute("countryList", countries);
		model.addAttribute("ageList", ages);
		model.addAttribute("questionairre" , new Questionairre());
		return "question/quiz";
	}
	
	@PostMapping("/quiz")
	public String addQuiz(@ModelAttribute("questionairre") Questionairre q) {
		questionService.saveQuest(q);
		return "redirect:/question/list";
	}
	
	@GetMapping("/list")
	public String showList(Model model) {
		model.addAttribute("quizs", questionService.findAll());
		return "question/list";
	}
}
