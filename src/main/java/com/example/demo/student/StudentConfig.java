// package com.example.demo.student;

// import java.time.LocalDate;
// import java.time.Month;
// import java.util.List;

// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// public class StudentConfig {

//     @Bean
//     CommandLineRunner commandLineRunner(StudentRepository repository) {
//         return args -> {
//             Student mark = new Student(
//                     "Mark",
//                     "mark.lawrence@gmail.com",
//                     LocalDate.of(2001, Month.JANUARY, 5)
//             );

//             Student alex = new Student(
//                     "Alex",
//                     "alex.lawrence@gmail.com",
//                     LocalDate.of(2000, Month.APRIL, 9)
//             );

//             repository.saveAll(
//                     List.of(mark, alex)
//             );
//         };
//     }
// }
