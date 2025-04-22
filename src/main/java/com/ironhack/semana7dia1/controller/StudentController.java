package com.ironhack.semana7dia1.controller;

import com.ironhack.semana7dia1.model.Student;
import com.ironhack.semana7dia1.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudent() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student findStudentById(@PathVariable(name = "id") Integer studentId){
        return studentService.findStudentById(studentId);
    }
}
