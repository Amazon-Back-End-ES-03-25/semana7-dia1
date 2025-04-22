package com.ironhack.semana7dia1.model;

import jakarta.persistence.*;

// una clase que es modelo es una clase que tiene representación en DB como tabla
@Entity // anotación para decir, esto en BBDD es una TABLA
@Table(name = "school_student") // anotación para sobreescribir el nombre de la TABLA, no es obligatoria
public class Student {

    @Id // identifica a este atributo como el ID de Student
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Anotación para decir que se autogenere mi ID
    private Integer studentId;
    // IDENTITY --> se auto-incrementa
    // AUTO --> también auto incrementa pero es JPA el que elige basado en my BBDD
    // SEQUENCE --> utiliza una secuencia de la base de datos que tenga (no la usaremos relamente)
    // TABLE --> utiliza una tabla en específico para generar los IDs (menos común también)

    @Column(name = "name") // no es obligatoria para identificar este atributo como columna, se usa para sobreescribir el nombre de la columna
    private String firstName;


    private String lastName;

    public Student() {
    }

    public Student(Integer studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer id) {
        this.studentId = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
