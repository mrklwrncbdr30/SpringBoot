package com.example.demo.instructor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface InstructorRepository extends JpaRepository<Instructor, Long>{
}
