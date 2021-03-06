package ua.online.courses.controller;

import java.math.BigDecimal;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import ua.online.courses.entity.Course;
import ua.online.courses.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController {
	
	
	@Autowired
	private CourseService courseService;
	
	
	@GetMapping("/add")
	public String addCoursePage(Model model) {
		model.addAttribute("course", new Course());
		return "course/add-course";
	}
	
	@GetMapping("/list")
	public String showCoursesList(Model model) {
		model.addAttribute("courseList", courseService.findAllCourses());
		return "course/courses-list";
	}
	
	@PostMapping("/add")
	public String saveCourse(
			@ModelAttribute("course") Course course) {
		
		courseService.saveCourse(course);
		return "redirect:/course/list";
	}
	
	@GetMapping("/find")
	public String findPage (Model model) {
		model.addAttribute("course", new Course());
		return "course/findCourse";
	}
	
	@PostMapping("/find")
	public String findCourse(@ModelAttribute("course") Course course, Model model) {
		model.addAttribute("courses", courseService.findCourseByTitle(course.getTitle()));
		return "redirect:/course/show";
	}
	
	@GetMapping("/show")
	public String showCourse() {
		return "course/showCourse";
	}
}
