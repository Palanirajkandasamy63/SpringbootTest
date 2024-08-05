package LearningSpringboot.SpringbootDemo.courses.repository;

import LearningSpringboot.SpringbootDemo.courses.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
