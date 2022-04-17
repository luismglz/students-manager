package com.luisgl.webstudents;

import com.luisgl.webstudents.entity.Student;
import com.luisgl.webstudents.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsCrudApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentsCrudApplication.class, args);
    }
    
    @Autowired
    private StudentRepository repo;

    @Override
    public void run(String... args) throws Exception {
      /*  Student student1 = new Student("Tetsuya", "Tamashiro", "tetsuya0@yahoo.co.jp");
        repo.save(student1);
        
        Student student2 = new Student("Shawn", "Pearson", "pearson11@gmail.com");
        repo.save(student2);*/
        
        
    }

}
