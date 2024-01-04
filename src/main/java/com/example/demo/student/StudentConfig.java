package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student sunny = new Student(
                    "Sunny",
                    "Sunny@univ-constantine2.dz",
                    LocalDate.of(2000, Month.JUNE, 17)
            );

            Student anfel = new Student(
                    "Anfel",
                    "Anfel@univ-constantine2.dz",
                    LocalDate.of(2001, Month.JUNE, 15)
            );

            List<Student> students = repository.saveAll(List.of(sunny, anfel));
        };
    }
}
