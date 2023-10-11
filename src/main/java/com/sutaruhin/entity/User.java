package com.sutaruhin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

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
    @NotEmpty
    @Length(max=20)
    private String name;


    @Column(length = 2)
    @Enumerated(EnumType.STRING)
    @NotNull
    private Gender gender;


    @Min(0)
    @Max(120)
    private Integer age;


    @Column(length = 50)
    @Email
    @Length(max=50)
    private String email;

}
