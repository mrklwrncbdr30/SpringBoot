package com.example.demo.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDTO getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public ResponseEntity<?> saveStudent(@RequestBody StudentDTO student) {
        try {
            StudentDTO savedStudent = studentService.saveStudent(student);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred while saving the student.");
        }
    }

// @RestController
// @RequestMapping("/api/v1/student") // Adjusted the mapping path for the controller
// public class StudentController {
//     @Autowired

//     private StudentService studentService;

//     @GetMapping("/")
//     public List<Student> getAllStudents() {
//         return studentService.getAllStudents();
//     }

//     @GetMapping("/{id}")
//     public Student getStudentById(@PathVariable Long id) {
//         return studentService.getStudentById(id);
//     }

//     @PostMapping
// public ResponseEntity<?> saveStudent(@RequestBody Student student) {
//     try {
//         Student savedStudent = studentService.saveStudent(student);
//         return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
//     } catch (Exception e) {
//         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred while saving the student.");
//     }
// }

    // @Autowired
    // public StudentController(StudentService studentService) {
    // this.studentService = studentService;
    // }

    // @GetMapping("/")
    // public List<Student> gStudentClasses() {
    // return studentService.gStudentClasses();
    // }

    // @GetMapping("/{id}")
    // public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
    // Optional<Student> studentOptional = studentService.getStudentById(id);
    // if (studentOptional.isPresent()) {
    // return ResponseEntity.ok().body(studentOptional.get());
    // } else {
    // return ResponseEntity.notFound().build();
    // }
    // }

    // @PostMapping
    // public ResponseEntity<Void> registerNewStudent(@RequestBody Student student)
    // {
    // studentService.addNewStudent(student);
    // return ResponseEntity.status(HttpStatus.CREATED).build();
    // }
}
