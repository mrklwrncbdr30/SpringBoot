package com.example.demo.instructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/instructor")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @GetMapping("/")
    public List<Instructor> getAllInstructors() {
        return instructorService.getAllInstructors();
    }

    @GetMapping("/{instructor_id}")
    public Instructor getInstructorById(@PathVariable Long instructor_id) {
        return instructorService.getInstructorById(instructor_id);
    }

    @PostMapping
    public ResponseEntity<?> saveInstructor(@RequestBody Instructor instructor) {
        try {
            Instructor savedInstructor = instructorService.saveInstructor(instructor);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedInstructor);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred while saving the instructor.");
        }
    }
}
