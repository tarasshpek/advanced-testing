package com.example.advancedtesting;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ConfigurationExample {

    @Autowired
    SomeInterface someInterface;

    @Test
    void testSomeInterface() {
        String text = someInterface.text();
        assertThat(text).isEqualTo("test");
    }

    interface SomeInterface {
        String text();
    }

    @TestConfiguration
    static class MyTestConfiguration {

        @Bean
        public SomeInterface someInterface() {
            return () -> "test";
        }
    }
}
