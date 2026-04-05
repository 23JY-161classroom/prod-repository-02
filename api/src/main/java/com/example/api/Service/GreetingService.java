package com.example.api.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.api.Entity.GreetingEntity;
import com.example.api.Repository.GreetingRepository;

@Service
public class GreetingService {

    private final GreetingRepository repository;

    public GreetingService(GreetingRepository repository) {
        this.repository = repository;
    }

    public Map<String, String> findOptionMap() {
        Map<String, String> optionMap = new HashMap<>();

        List<GreetingEntity> entities = repository.findAll();
        entities.forEach(entity ->
            optionMap.put(entity.getLang(), entity.getName())
        );

        return optionMap;
    }

    public String findText(String lang) {
        return repository.findGreetingByLang(lang)
            .map(GreetingEntity::getText)
            .orElseThrow(() ->
                new IllegalArgumentException("指定された lang が存在しません: " + lang)
            );
    }
}