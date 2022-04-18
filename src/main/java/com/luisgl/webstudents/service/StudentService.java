package com.luisgl.webstudents.service;

import com.luisgl.webstudents.entity.Student;
import java.util.List;


public interface StudentService {
    
    public List<Student> getStudents();
    
    public Student createStudent(Student student);
}
