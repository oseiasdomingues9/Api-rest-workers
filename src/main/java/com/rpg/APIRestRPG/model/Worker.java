package com.rpg.APIRestRPG.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Worker implements Serializable {

    private static final long serialVersionUID = 3840841225884920061L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private String phone;
    private LocalDate birthDate;
    @ManyToOne
    private Company company;

    public Worker(String name, Integer age, Company company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }
}
