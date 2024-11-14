package com.example.demo.exception;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    USER_EXISTED(1001, "User already exist!"),
    USERNAME_INVALID(1002, "User must be at least 3 character!"),
    PASSWORD_INVALID(1003, "User must be at least 8 character"),
    USER_NOT_EXIST(1004, "User not exist!"),
    UNAUTHENTICATED(1005, "Unauthenticated"),
    INVALID_DOB(1006, "Invalid date of birth");
    int code;
    String message;
}
