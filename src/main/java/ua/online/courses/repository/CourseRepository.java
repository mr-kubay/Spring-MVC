package ua.online.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.online.courses.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{
//	@Query("select c from Course c where c.title = :title")
//	Course findByTitle(@Param("title") String title);
}
