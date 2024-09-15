package com.example.actions_app.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "actions")
public class ActionAppEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String name;
    private String email;
    private LocalDate registrationDate;
    private LocalDate birthDate;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public ActionAppEntity(long id, String name, LocalDate registrationDate, String email, LocalDate birthDate) {
        Id = id;
        this.name = name;
        this.registrationDate = registrationDate;
        this.email = email;
        this.birthDate = birthDate;
    }

    public ActionAppEntity() {
    }
}
