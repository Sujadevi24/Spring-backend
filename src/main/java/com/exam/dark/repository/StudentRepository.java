package com.exam.dark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exam.dark.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}