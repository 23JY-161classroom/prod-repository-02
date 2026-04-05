package com.example.api.Controller;

import com.example.api.Service.GreetingService;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(GreetingController.class)
class GreetingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private GreetingService greetingService;

    @Test
    void options_正常にMapが返る() throws Exception {

        Map<String, String> mockMap = Map.of(
                "en", "English",
                "ja", "Japanese"
        );

        BDDMockito.given(greetingService.findOptionMap())
                .willReturn(mockMap);

        mockMvc.perform(get("/options"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.en").value("English"))
                .andExpect(jsonPath("$.ja").value("Japanese"));
    }

    @Test
    void greeting_langありで正常取得() throws Exception {

        BDDMockito.given(greetingService.findText("en"))
                .willReturn("Hello");

        mockMvc.perform(get("/greeting")
                .param("lang", "en"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello"));
    }

    @Test
    void greeting_langなしでエラーメッセージ() throws Exception {

        mockMvc.perform(get("/greeting"))
                .andExpect(status().isOk())
                .andExpect(content().string("lang パラメータが必要です"));
    }
}