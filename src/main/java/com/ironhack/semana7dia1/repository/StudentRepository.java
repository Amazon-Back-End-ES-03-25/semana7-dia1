package com.ironhack.semana7dia1.repository;

import com.ironhack.semana7dia1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// El repositorio es como mi query console donde hago consultas a mi BBDD
@Repository // no es obligatorio
public interface StudentRepository extends JpaRepository<Student,Integer> {
}

/* CHULETILLA
@Repository
public interface EntityRepository extends JpaRepository<Entity,EntityIdDataType> {
}
*/
