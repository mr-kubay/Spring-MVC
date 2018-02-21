package ua.online.courses.service;

import java.util.List;


import ua.online.courses.entity.Course;

public interface CourseService {

	void saveCourse(Course course);
	
	List<Course> findAllCourses();
	
	Course findCourseById(int id);
	
	Course findCourseByTitle(String title);
	
}
