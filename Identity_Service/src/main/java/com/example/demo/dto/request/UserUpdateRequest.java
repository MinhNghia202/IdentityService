package com.example.demo.dto.request;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.Size;

import com.example.demo.validator.DobConstraint;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateRequest {
    @Size(min = 8, message = "Password must be at least 8 character")
    private String password;

    private String fullName;

    @DobConstraint(min = 18, message = "INVALID_DOB")
    private LocalDate dob;

    private List<String> roles;
}
