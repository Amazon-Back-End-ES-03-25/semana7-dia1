package com.ironhack.semana7dia1.model;

import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    @Id
    private String courseCode;

    @Column(name = "course_name")
    private String courseName;

    public Course() {
    }

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
