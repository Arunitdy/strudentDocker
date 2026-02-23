package com.docker.strudent;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class StudentController {

    public List<Student> getStudents() {
        return List.of(
            new Student(1, "ram", 22),
            new Student(2, "jhon", 26),
            new Student(3, "Alice", 18)
        );
    }

}
