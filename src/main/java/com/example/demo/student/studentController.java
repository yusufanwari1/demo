package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping
public class studentController {

    private final studentService StudentService;

    @Autowired
    public studentController(studentService studentService) {
        this.StudentService = studentService;
    }


    @GetMapping("/students")
    public List<student> getStudents(){
        return StudentService.getStudents();
    }
}
