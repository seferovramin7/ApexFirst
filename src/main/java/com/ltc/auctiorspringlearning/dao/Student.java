package com.ltc.auctiorspringlearning.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "telebe")
public class Student {
    @Id
    private Long id;

    private String name;

    private int age;

    private String surname;

}
