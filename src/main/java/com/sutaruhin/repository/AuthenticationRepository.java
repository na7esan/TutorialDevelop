package com.sutaruhin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sutaruhin.entity.Authentication;

public interface AuthenticationRepository extends JpaRepository<Authentication, String> {
}
