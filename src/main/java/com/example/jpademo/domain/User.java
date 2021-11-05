package com.example.jpademo.domain;

import com.example.jpademo.type.JsonObjectConverter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.json.JSONObject;

import javax.persistence.*;
import java.io.IOException;
import java.util.List;

@Entity
@Table(name = "USERS")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @NonNull
    @Column(columnDefinition = "TEXT")
    @Convert(converter = JsonObjectConverter.class)
    private List<String> languages;
}
