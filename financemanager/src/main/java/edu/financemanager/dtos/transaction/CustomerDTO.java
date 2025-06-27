package edu.financemanager.dtos.transaction;

import java.time.LocalDate;

public class CustomerDTO {
    private String name;

    private LocalDate birthday;

    // Constructors

    public CustomerDTO() {}

    public CustomerDTO(String name, LocalDate birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }

    // Getters & Setters

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
