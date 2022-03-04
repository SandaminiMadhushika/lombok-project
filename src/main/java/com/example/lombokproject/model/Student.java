package com.example.lombokproject.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor
@Data
@Builder
public class Student {
    private Long id;
    private int indexNumber;
    private String firstName;
    private String lastName;
}
