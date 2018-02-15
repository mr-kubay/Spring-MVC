package ua.online.courses.controller;

import java.math.BigDecimal;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.online.courses.entity.Course;
import ua.online.courses.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController {
	
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/add")
	public String showAddCoursePage() {
		return "course/add-course";
	}
	
	@GetMapping("/list")
	public String showCoursesList(Model model) {
		model.addAttribute("courseList", courseService.findAllCourses());
		return "course/courses-list";
	}
	
	@PostMapping("/add")
	public String saveCourse(
			@RequestParam("title") String title,
			@RequestParam("description") String desc,
			@RequestParam("price") BigDecimal price) {
		
		Course course = new Course();
		course.setTitle(title);
		course.setDescription(desc);
		course.setPrice(price);
		
		courseService.saveCourse(course);
		return "redirect:/course/list";
	}
	
	@GetMapping("/find")
	public String findPage () {
		return "course/findCourse";
	}
	
//	@PostMapping("/find")
//	public String findCourse(@RequestParam("title") String title, Model model) {
//		Course course = courseService.findCourseByTitle(title);
//		model.addAttribute("course", course);
//		return "redirect:/course/show";
//	}
//	
//	@GetMapping("/show")
//	public String showCourse() {
//		return "course/showCourse";
//	}
}
