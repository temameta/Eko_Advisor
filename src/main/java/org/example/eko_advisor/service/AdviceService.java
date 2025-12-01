package org.example.eko_advisor.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.eko_advisor.mappers.Advice;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class AdviceService {
    public Advice getAdvice() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Чтение из файла
            return objectMapper.readValue(
                    new File("src/main/resources/data/advice.json"),
                    Advice.class
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
