package com.lixega.reminder_app.config;

import com.lixega.reminder_app.service.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class StartupEmailSender implements CommandLineRunner {

    private EmailService emailService;

    @Override
    public void run(String... args) throws Exception {

    }
}
