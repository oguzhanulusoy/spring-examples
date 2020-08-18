package com.ulusoy.api;

import com.ulusoy.entity.Course;
import com.ulusoy.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseAPI {

    @Autowired
    private CourseRepository courseRepository;

    @PostMapping
    public ResponseEntity<Course> post (@RequestBody Course course) {
        return ResponseEntity.ok(courseRepository.save(course));
    }

    @GetMapping
    public ResponseEntity<List<Course>> get() {
        return ResponseEntity.ok(courseRepository.findAll());
    }


}
