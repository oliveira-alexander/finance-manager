package edu.financemanager.dtos.customer;

import java.time.LocalDate;

public class CustomerCreateDTO {
    private String name;
    private LocalDate birthday;

    // Constructors

    public CustomerCreateDTO() {}

    public CustomerCreateDTO(String name, LocalDate birthday)
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
