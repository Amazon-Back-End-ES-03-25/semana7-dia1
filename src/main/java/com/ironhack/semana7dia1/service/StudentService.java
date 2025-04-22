package com.ironhack.semana7dia1.service;

import com.ironhack.semana7dia1.model.Student;
import com.ironhack.semana7dia1.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    // lista de estudiantes en memoria
    private final List<Student> students = new ArrayList<>();

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudentInMemory(Student student) {
        students.add(student);
        return student;
    }

    public List<Student> getAllStudentsInMemory() {
        return students;
    }

    public Student createStudent(Student student) {
        Student savedStudent = studentRepository.save(student); // save es un método del repositorio que extiendo, no lo he creado yo
        return savedStudent;
    }

    public List<Student> getAllStudents() {
        List<Student> foundStudents = studentRepository.findAll(); // findAll es un método del repositorio que extiendo, no lo he creado yo
        return foundStudents;
    }

    public Student findStudentById(Integer studentId){
        // en memoria habríamos hecho un loop sobre nuestra lista y si lo encontramos lo devolvemos
        Optional<Student> optionalStudent = studentRepository.findById(studentId);

        if (optionalStudent.isPresent()){
            return optionalStudent.get();
        } else{
            return null;
        }

        // return (cláusula de validación) ? lo que quiero hacer si es verdadero : lo que quiero hacer si es falso;
        // return optionalStudent.isPresent() ? optionalStudent.get() : null;

        // return optionalStudent.orElse(null); --> método de los opcionales
    }
}
