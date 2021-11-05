package com.example.jpademo.type;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.io.IOException;
import java.util.List;

@Converter
@Slf4j
public class JsonObjectConverter implements AttributeConverter<List<String>, String> {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(List<String> stringList) {
        String json = null;
        try{
            json = objectMapper.writeValueAsString(stringList);
        } catch (JsonProcessingException e) {
            log.error(e.getMessage());
        }
        return json;
    }

    @Override
    public List<String> convertToEntityAttribute(String json) {
        List<String> stringList = null;
        try {
            stringList = objectMapper.readValue(json, List.class);
        } catch (IOException e) {
            log.error(e.getMessage());
        }

        return stringList;
    }
}