package com.lixega.reminder_app.controller;

import com.lixega.reminder_app.service.ReminderService;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/reminder")
@AllArgsConstructor
public class ReminderController {

    private ReminderService reminderService;


}
