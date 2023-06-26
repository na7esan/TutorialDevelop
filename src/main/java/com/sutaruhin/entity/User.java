package com.sutaruhin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {


    public static enum Gender {
        男性, 女性
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(length = 20, nullable = false)
    private String name;


    @Column(length = 2)
    @Enumerated(EnumType.STRING)
    private Gender gender;


    private Integer age;


    @Column(length = 50)
    private String email;

}
