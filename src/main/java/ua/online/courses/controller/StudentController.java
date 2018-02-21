package ua.online.courses.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.online.courses.entity.Student;
import ua.online.courses.enums.Degree;
import ua.online.courses.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/add")
	public String showAddPage(Model model) {
		LinkedHashMap<String, String> countryOptions = new LinkedHashMap<>();
		countryOptions.put("USA", "United States");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("UA", "Ukraine");
		
		List<String> favLangs = new ArrayList<>();
		
		favLangs.add("Java");
		favLangs.add("C #");
		favLangs.add("PHP");
		
		model.addAttribute("studentDegrees" , Degree.values());
		model.addAttribute("favLangs", favLangs);
		model.addAttribute("countryOptions" , countryOptions);
		model.addAttribute("studentModel", new Student());
		return "student/add";
	}

	@PostMapping("/add")
	public String saveStudent(@ModelAttribute ("studentModel") Student student) {
		studentService.saveStudent(student);
		return "redirect:/student/list";
	}
	@GetMapping("/list")
	public String showListPage(Model model) {
		model.addAttribute("studentList", studentService.findAll());
		return "student/list";
	}
}
