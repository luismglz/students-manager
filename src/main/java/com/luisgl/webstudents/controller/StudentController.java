package com.luisgl.webstudents.controller;

import com.luisgl.webstudents.entity.Student;
import com.luisgl.webstudents.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping({"/students", "/"})
    public String getStudents(Model model) {

        model.addAttribute("students", service.getStudents());
        return "students";//redirects to the students file
    }

    @GetMapping("/students/new")
    public String routerCreateStudent(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "create-student.html";
    }

    @PostMapping("/students")
    public String createStudent(@ModelAttribute("student") Student student) {
        service.createStudent(student);
        return "redirect:students";
    }

    @GetMapping("/students/update/{id}")
    public String routerUpdateStudent(@PathVariable Long id, Model model) {
        model.addAttribute("student", service.getStudentById(id));
        return "update-student";
    }
 
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student selectedStudent, Model model) {

        Student toUpdateStudent = service.getStudentById(id);
        toUpdateStudent.setId(id);
        toUpdateStudent.setName(selectedStudent.getName());
        toUpdateStudent.setLastname(selectedStudent.getLastname());
        toUpdateStudent.setEmail(selectedStudent.getEmail());

        service.updateStudent(toUpdateStudent);
        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
        return "redirect:/students";
    }

}
