package com.example.lombokproject;

import com.example.lombokproject.model.Student;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class LombokProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokProjectApplication.class, args);

		Student student1 = Student.builder()
				.id(2L)
				.indexNumber(3545447)
				.firstName("Sandamini")
				.lastName("Madushika").build();
		log.info("student: {}", student1);
	}

}

// Student student = new Student();
// student.setFirstName("Sandamini");
// student.setLastName("Madushika");
// student.setId(1L);
// student.setIndexNumber(1122234);
// log.info("student: {}", student);

// private static final Logger log =
// LoggerFactory.getLogger(LombokProjectApplication.class);
