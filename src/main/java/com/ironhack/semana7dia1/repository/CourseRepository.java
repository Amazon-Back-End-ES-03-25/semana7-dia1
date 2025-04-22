package com.ironhack.semana7dia1.repository;

import com.ironhack.semana7dia1.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
}
