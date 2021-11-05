package com.example.jpademo.domain;

import com.example.jpademo.type.JsonObjectConverter;
import com.example.jpademo.type.ValidLanguage;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
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
    @ValidLanguage
    private List<String> languages;
}
