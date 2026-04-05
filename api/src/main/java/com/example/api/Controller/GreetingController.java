package com.example.api.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.Service.GreetingService;

@RestController
public class GreetingController {

    private final GreetingService service;

    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @GetMapping("/options")
    public Map<String, String> options() {
        return service.findOptionMap();
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(required = false) String lang) {
        if (lang == null || lang.isEmpty()) {
            return "lang パラメータが必要です";
        }
        return service.findText(lang);
    }
}