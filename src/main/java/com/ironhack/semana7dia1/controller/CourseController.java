package com.ironhack.semana7dia1.controller;

import com.ironhack.semana7dia1.model.Course;
import com.ironhack.semana7dia1.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @GetMapping
    public List<Course> getAllCourse() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course findCourseById(@PathVariable(name = "id") String courseCode) {
        return courseService.findCourseById(courseCode);
    }
}
