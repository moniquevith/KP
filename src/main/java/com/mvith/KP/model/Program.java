package com.mvith.KP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "program")
public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    private Integer age_min;
    private Integer age_max;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private ProgramType type_id;  

    @ManyToOne
    @JoinColumn(name = "org_id")
    private Organisation org_id; 

    public Program() {}

    public Program(ProgramType type_id, Organisation org_id, Integer age_min, Integer age_max, String name, String description) {
        this.type_id = type_id;
        this.org_id = org_id;
        this.age_min = age_min;
        this.age_max = age_max;
        this.name = name; 
        this.description = description;
    }

    public ProgramType getType_id() {
        return type_id;
    }

    public void setType_id(ProgramType type_id) {
        this.type_id = type_id;
    }

    public Organisation getOrg_id() {
        return org_id;
    }

    public void setOrg_id(Organisation org_id) {
        this.org_id = org_id;
    }

    public Integer getAge_min() {
        return age_min;
    }

    public void setAge_min(Integer age_min) {
        this.age_min = age_min;
    }

    public Integer getAge_max() {
        return age_max;
    }

    public void setAge_max(Integer age_max) {
        this.age_max = age_max;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
