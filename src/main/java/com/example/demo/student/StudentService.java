package com.example.demo.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
@Autowired

    private StudentRepository studentRepository;

    public List<StudentDTO> getAllStudents(){
        return studentRepository.findAll();
    }

    public StudentDTO getStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
    }

    public StudentDTO saveStudent(StudentDTO studentDTO){
        return studentRepository.save(studentDTO);
    }
    // private static StudentRepository studentRepository = null;

    // public StudentService(StudentRepository studentRepository) {
    //     StudentService.studentRepository = studentRepository;
    // }

    // public List<Student> gStudentClasses() {
    //     return studentRepository.findAll();
    // }

    // public void addNewStudent(Student student) {
    //     studentRepository.save(student);
    // }

    // public Optional<Student> getStudentById(Long id) {
    //     return studentRepository.findById(id);
    // }

    // public List<Student> getAllStudents() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getAllStudents'");
    // }
}
