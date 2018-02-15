package ua.online.courses.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.online.courses.entity.Course;
import ua.online.courses.repository.CourseRepository;
import ua.online.courses.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public void saveCourse(Course course) {
		courseRepository.save(course);
	}

	@Override
	public List<Course> findAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Course findCourseById(int id) {
		return courseRepository.findOne(id);
	}


}
