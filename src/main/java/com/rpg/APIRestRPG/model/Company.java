package com.rpg.APIRestRPG.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Company implements Serializable {

    private static final long serialVersionUID = 2637671291162563273L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Integer numberWorkers;

    @OneToMany
    @JsonIgnore
    private List<Worker> workers = new ArrayList<>();

    public Company(Long id, String name, String email, Integer numberWorkers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.numberWorkers = numberWorkers;
    }
}
