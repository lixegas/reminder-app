package com.lixega.reminder_app;

import com.lixega.reminder_app.service.EmailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.javamail.JavaMailSender;


@SpringBootApplication
public class ReminderAppApplication {
	public static void main(String[] args) {SpringApplication.run(ReminderAppApplication.class, args);

	}
}
