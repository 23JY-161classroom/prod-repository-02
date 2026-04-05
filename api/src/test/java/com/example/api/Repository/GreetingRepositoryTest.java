package com.example.api.Repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import com.example.api.Entity.GreetingEntity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class GreetingRepositoryTest {

    @Autowired
    private GreetingRepository repository;

    @Test
    @DisplayName("langで正しく検索できる")
    void findGreetingByLang_正常系() {

        Optional<GreetingEntity> result =
                repository.findGreetingByLang("en");

        assertTrue(result.isPresent());
        assertEquals("Hello", result.get().getText());
    }

    @Test
    @DisplayName("存在しないlangの場合はempty")
    void findGreetingByLang_存在しない場合() {
        Optional<GreetingEntity> result =
                repository.findGreetingByLang("xx");

        assertTrue(result.isEmpty());
    }
}