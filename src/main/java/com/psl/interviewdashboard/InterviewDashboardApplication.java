package com.psl.interviewdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = JpaRepositoriesAutoConfiguration.class)
@EnableAutoConfiguration(exclude=HibernateJpaAutoConfiguration.class) 
public class InterviewDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewDashboardApplication.class, args);
	}
}
