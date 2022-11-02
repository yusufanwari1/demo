package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service // @Service and @Component are same but this is for semantic
public class studentService {

    public List<student> getStudents() {
        return List.of(
                new student(
                        1L,
                        "Maryam", "maryam1@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 20),
                        25)
        );
    }
}
