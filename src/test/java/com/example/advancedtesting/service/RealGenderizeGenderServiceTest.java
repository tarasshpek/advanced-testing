package com.example.advancedtesting.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class RealGenderizeGenderServiceTest {

    @Autowired
    private GenderizeService service;

    @Test
    void testGender() {
        String gender = service.getGender("Taras");
        assertThat(gender).isEqualTo("male");
    }

}