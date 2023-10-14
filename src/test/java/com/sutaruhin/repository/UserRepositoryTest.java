package com.sutaruhin.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sutaruhin.entity.User;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void testFindById() {
        User user = userRepository.findById(1).get();
        assertEquals(user.getId(), 1);
        assertEquals(user.getName(), "スタルヒン太郎");
    }
}
