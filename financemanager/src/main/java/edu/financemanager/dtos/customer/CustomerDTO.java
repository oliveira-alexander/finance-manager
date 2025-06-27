package edu.financemanager.dtos.customer;

import java.time.LocalDate;

public class CustomerDTO {
    private long id;
    private String name;
    private LocalDate birthday;
    private String email;

    // Constructors

    public CustomerDTO() {}

    public CustomerDTO(long id, String name, LocalDate birthday, String email)
    {
        this.id = id;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
