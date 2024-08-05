package LearningSpringboot.SpringbootDemo.courses.controller;

import LearningSpringboot.SpringbootDemo.courses.bean.Course;
import LearningSpringboot.SpringbootDemo.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    //http://localhost:8080/courses

    @Autowired
    private CourseRepository repository;
    @GetMapping("/courses")
    public List<Course> getAllCourse() {
        return repository.findAll();
       // return Arrays.asList(new Course(1, "learn Microservices", "Raj"),new Course(2, "learn Microservices chapt2 ", "Raj"));
    }

    @GetMapping("/courses/{id}")
    public Course getCourse1(@PathVariable long id) {
        Optional<Course> course = repository.findById(id);
        if(course.isEmpty()){
            throw new RuntimeException("course not found with id " + id);
        }
         return course.get();
        //return new Course(1, "learn Microservices", "Raj");
    }
}