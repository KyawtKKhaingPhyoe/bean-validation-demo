package com.example.demobeanvalidation.ds;

import com.example.demobeanvalidation.validation.NameNotAdmin;
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

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NameNotAdmin(message = "name cannot be admin!")
    @NotEmpty(message = "{myapp.validation.msg.firstname}")
    private String firstName;
    @NotEmpty(message = "LastName cant be empty!")
    private String lastName;
    @Min(value = 18,message = "You are too young!")
    @Max(value = 60,message = "You are too old!")
    private int age;
    @Email(message = "Invalid email format!")
    private String email;
    private LocalDate orderDate;
    private LocalDate paymentDate;
    private int orderCount;

}
