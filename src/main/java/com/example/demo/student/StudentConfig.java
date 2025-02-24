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
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student s1 = new Student(
                    1L,
                    "Marian",
                    "marian.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student s2 = new Student(
                    2L,
                    "Anna",
                    "anna@gmail.com",
                    LocalDate.of(2001, Month.FEBRUARY, 6)
            );

            repository.saveAll(List.of(s1, s2));
        };
    }
}
