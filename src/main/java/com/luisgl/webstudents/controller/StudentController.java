package com.luisgl.webstudents.controller;

import com.luisgl.webstudents.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    
    @Autowired
    private StudentService service;
    
    @GetMapping({"/students","/"})
    public String getStudents(Model model){
        
        model.addAttribute("students", service.getStudents());
        return "students";//redirects to the students file
    }
}
