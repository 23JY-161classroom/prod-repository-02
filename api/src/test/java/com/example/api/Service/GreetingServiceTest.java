package com.example.api.Service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.example.api.Entity.GreetingEntity;
import com.example.api.Repository.GreetingRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class GreetingServiceTest {

    private GreetingRepository repository;
    private GreetingService service;

    @BeforeEach
    void setup() {
        repository = Mockito.mock(GreetingRepository.class);
        service = new GreetingService(repository);
    }

    @Test
    void findOptionMap_正常系() {
        // モックデータ
        GreetingEntity en = new GreetingEntity();
        en.setLang("en");
        en.setName("English");

        GreetingEntity ja = new GreetingEntity();
        ja.setLang("ja");
        ja.setName("Japanese");

        List<GreetingEntity> mockList = Arrays.asList(en, ja);

        when(repository.findAll()).thenReturn(mockList);

        Map<String, String> result = service.findOptionMap();

        assertEquals(2, result.size());
        assertEquals("English", result.get("en"));
        assertEquals("Japanese", result.get("ja"));
    }

    @Test
    void findText_正常系() {
        GreetingEntity en = new GreetingEntity();
        en.setLang("en");
        en.setText("Hello");

        when(repository.findGreetingByLang("en"))
                .thenReturn(Optional.of(en));

        String result = service.findText("en");

        assertEquals("Hello", result);
    }

    @Test
    void findText_異常系_langが存在しない() {
        when(repository.findGreetingByLang("xx"))
                .thenReturn(Optional.empty());

        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> service.findText("xx"));

        assertTrue(exception.getMessage().contains("指定された lang が存在しません"));
    }
}