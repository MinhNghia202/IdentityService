package com.example.demo.service;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.dto.reponse.UserResponse;
import com.example.demo.dto.request.UserCreationRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@SpringBootTest
@AutoConfigureMockMvc
public class UserServiceTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    private UserCreationRequest request;
    private UserResponse response;
    private LocalDate dob;
    private User user;
    private UserRepository userRepository;

    @BeforeEach
    void initData() {
        dob = LocalDate.of(2002, 12, 1);
        request = UserCreationRequest.builder()
                .username("join")
                .fullName("John")
                .dob(dob)
                .password("12345678")
                .build();

        response = UserResponse.builder()
                .id("5a1d32b1-26b6-4155-bfba-661821b391d3")
                .username("join")
                .fullName("John")
                .dob(dob)
                .build();
        user = User.builder()
                .id("5a1d32b1-26b6-4155-bfba-661821b391d3")
                .username("join")
                .fullName("John")
                .dob(dob)
                .build();
    }

    @Test
    void createUser_validRequest_success() throws Exception {
        // GIVEN
        Mockito.when(userRepository.existsByUsername(ArgumentMatchers.anyString()))
                .thenReturn(false);
        Mockito.when(userRepository.save(ArgumentMatchers.any())).thenReturn(user);
        // WHEN
        var response = userService.createUser(request);

        // THEN
    }
}
