package com.example.jpademo.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Language {
    DE("German"),
    FR("French"),
    EN("English"),
    ES("Spanish");

    private final String value;

    @Override
    public String toString() {
        return this.value;
    }
}
