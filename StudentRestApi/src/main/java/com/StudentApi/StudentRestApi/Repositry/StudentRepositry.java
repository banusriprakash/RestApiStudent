package com.StudentApi.StudentRestApi.Repositry;

import com.StudentApi.StudentRestApi.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositry extends JpaRepository<Student,Integer> {
}
