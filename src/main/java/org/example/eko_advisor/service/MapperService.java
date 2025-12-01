package org.example.eko_advisor.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.eko_advisor.mappers.Advice;
import org.example.eko_advisor.mappers.ESG;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class MapperService {
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
    public ESG getESG() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Чтение из файла
            return objectMapper.readValue(
                    new File("src/main/resources/data/esg.json"),
                    ESG.class
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
