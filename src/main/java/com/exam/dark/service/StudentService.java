package com.exam.dark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dark.entity.Student;
import com.exam.dark.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student addStudent(Student s) {
        return repo.save(s);
    }

    public List<Student> getStudent() {
        return repo.findAll();
    }

    public Student updateStudent(Student s, int id) {

        Student s1 = repo.findById(id).orElse(null);

        if (s1 != null) {
            s1.setName(s.getName());
            s1.setAge(s.getAge());

            return repo.save(s1);
        }

        return null;
    }
public Student upStudent(Student s, int id) {

    Student s1 = repo.findById(id).orElse(null);

    if (s1 == null) {
        return null;
    }

    if (s.getName() != null) {
        s1.setName(s.getName());
    }

    if (s.getAge() != 0) {
        s1.setAge(s.getAge());
    }

    return repo.save(s1);
}

  public String deletestudent(int id) {

    Student s = repo.findById(id).orElse(null);

    if (s == null) {
        return "Student Not Found";
    }

    repo.delete(s);

    return "Deleted Successfully";
}
}
