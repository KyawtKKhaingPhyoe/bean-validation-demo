package com.example.demobeanvalidation.ds;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "FirstName cant be empty!")
    private String firstName;
    @NotEmpty(message = "LastName cant be empty!")
    private String lastName;
    @Min(value = 18,message = "You are too young!")
    @Max(value = 60,message = "You are too old!")
    private int age;
    @Email(message = "Invalid email format!")
    private String email;

}
