package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.InvalidateToken;

public interface InvalidateTokenRepository extends JpaRepository<InvalidateToken, String> {}
