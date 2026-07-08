package com.exam.dark.controller;
import com.exam.dark.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.exam.dark.service.StudentService;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StudentController {
    @Autowired 
    private StudentService service;
    @PostMapping("/std")
public Student addStudent(@RequestBody Student s) {
    return service.addStudent(s);
}
    @GetMapping("/st")
    public List <Student>getStudent(){
        return service.getStudent();
    }
@PutMapping("/suj/{id}")
public Student updateStudent(@RequestBody Student s, @PathVariable int id) {
    return service.updateStudent(s, id);
}

@PatchMapping("/su/{id}")
public Student upStudent(@RequestBody Student s, @PathVariable int id) {
    return service.upStudent(s, id);
}
    @DeleteMapping("/Student/{id}")
    public String deleteStudent(@PathVariable int id){
        return service.deletestudent(id);
    }

}
