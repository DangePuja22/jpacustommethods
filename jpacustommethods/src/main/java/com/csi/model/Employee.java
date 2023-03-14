package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue

    private int empId;
    @Size(min = 2, message = "Employee First Name must be 2 characters")
    private String empFirstName;
    @Pattern(regexp = "[A-Za-z]*", message = "Last name should not contain space and special characters")
    private String empLastName;

    private String empAddress;
    @Size(min = 10, max = 10, message = "Employee ContactNumber must be at least 10 digits")
    @Column(unique = true)
    private String empContactNumber;

    private double empSalary;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date empDOB;
    @Email(message = "Email Id must be valid")
    @Column(unique = true)
    private String empEmailId;
    @Size(min = 4, message = "Employee password must be atleast 4 character")
    private String empPassword;


}
