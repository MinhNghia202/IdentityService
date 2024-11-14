package com.example.demo.dto.reponse;

import java.time.LocalDate;
import java.util.Set;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class UserResponse {
    String id;
    String username;
    String fullName;
    LocalDate dob;
    Set<RoleResponse> roles;
}
