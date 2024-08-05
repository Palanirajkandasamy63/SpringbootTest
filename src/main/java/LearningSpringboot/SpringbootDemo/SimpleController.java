package LearningSpringboot.SpringbootDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SimpleController {

    //http://localhost:8080/courses

    @GetMapping("/courses")
    public List<Course> getAllCourse() {
        return Arrays.asList(new Course(1, "learn Microservices", "Raj"),new Course(2, "learn Microservices chapt2 ", "Raj"));
    }

    @GetMapping("/courses/1")
    public Course getCourse1() {
        return new Course(1, "learn Microservices", "Raj");
    }
}