package com.example.demo.dto.request;

import java.time.LocalDate;

import com.example.demo.validator.DobConstraint;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    String username;
    String password;
    String fullName;

    @DobConstraint(min = 18, message = "INVALID_DOB")
    LocalDate dob;
}
