package com.luisgl.webstudents.service;

import com.luisgl.webstudents.entity.Student;
import com.luisgl.webstudents.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository repo;
    
    @Override
    public List<Student> getStudents() {
        return repo.findAll();
    }

    @Override
    public Student createStudent(Student student) {
        return repo.save(student);
    }
    
}
