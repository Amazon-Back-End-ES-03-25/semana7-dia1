package com.ironhack.semana7dia1.service;

import com.ironhack.semana7dia1.model.Course;
import com.ironhack.semana7dia1.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course createCourse(Course course) {
        Course savedCourse = courseRepository.save(course); // save es un método del repositorio que extiendo, no lo he creado yo
        return savedCourse;
    }

    public List<Course> getAllCourses() {
        List<Course> foundCourses = courseRepository.findAll(); // findAll es un método del repositorio que extiendo, no lo he creado yo
        return foundCourses;
    }

    public Course findCourseById(String courseCode) {
        Optional<Course> optionalCourse = courseRepository.findById(courseCode);

        return optionalCourse.orElse(null);
    }
}
