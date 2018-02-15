package ua.online.courses.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.online.courses.entity.Course;

public interface CourseService {

	void saveCourse(Course course);
	
	List<Course> findAllCourses();
	
	Course findCourseById(int id);
	
}
