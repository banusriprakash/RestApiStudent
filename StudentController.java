package com.StudentApi.StudentRestApi.Controller;

import com.StudentApi.StudentRestApi.Entity.Student;
import com.StudentApi.StudentRestApi.Repositry.StudentRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentRepositry repositry;
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> students=repositry.findAll();
        return students;
    }

    @GetMapping("/students/{id}")
    public Optional<Student> getStudent(@PathVariable int id){
        Optional<Student> st=repositry.findById(id);
        return st;
    }
    @PostMapping("/students/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addStudent(@RequestBody Student student){
        repositry.save(student);
    }

    @PutMapping("/students/update/{id}")
    public Student Updatestudent(@PathVariable int id){
       Student student=repositry.findById(id).get();
       student.setBranch("CSE");
       student.setName("harish");
       student.setPercentage(92);
       repositry.save(student);
       return student;
    }

    @DeleteMapping("students/delete/{id}")
    public void deleteStudent(@PathVariable int id){
        Student student=repositry.findById(id).get();
        repositry.delete(student);

    }
}
