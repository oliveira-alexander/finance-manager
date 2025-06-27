package edu.financemanager.dtos.customer;

import java.time.LocalDate;

public class CustomerCreateDTO {
    private String name;
    private LocalDate birthday;
    private String email;

    // Constructors

    public CustomerCreateDTO() {}

    public CustomerCreateDTO(String name, LocalDate birthday, String email)
    {
        this.name = name;
        this.birthday = birthday;
        this.email = email;
    }

    // Getters & Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
