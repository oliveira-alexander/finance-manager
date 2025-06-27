package edu.financemanager.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "Customers")
public class Customer {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private LocalDate birthday;

    @OneToOne (mappedBy = "customer")
    private Account account;

    private String email;

    // Constructors
    public Customer() {}

    public Customer(String name, LocalDate birthday, String email)
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
