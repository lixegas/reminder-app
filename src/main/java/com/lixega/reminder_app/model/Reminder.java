package com.lixega.reminder_app.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Reminder {

    private Integer id;
    private String mail;
    private String message;
    private type status;

}
